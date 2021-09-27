package com.softienda.tienda.producto;

import co.com.sofka.domain.generic.EventChange;
import com.softienda.tienda.producto.events.*;

import java.util.HashSet;
import java.util.Set;

public class ProductoChange extends EventChange {
    public ProductoChange(Producto producto) {
        apply((ProductoCreado event)->{
            producto.nombre = event.getNombre();
            producto.precio = event.getPrecio();
            producto.cantidad = event.getCantidad();
            producto.categorias = new HashSet<>();
        });
        apply((CategoriaAgregada event)->{
            producto.categorias.add(new Categoria(
                    event.getCategoriaId(),
                    event.getNombre()
            ));
        });

        apply((CategoriaActualizada event)->{
            Categoria categoria= producto.getCategoriaPorId(event.getEntityId())
                    .orElseThrow(()-> new IllegalArgumentException("No existe una categoría con el id"+event.getEntityId()));
            categoria.actualizarNombre(event.getNombre());
        });

        apply((CategoriaEliminada event)->{
            Categoria categoria= producto.getCategoriaPorId(event.getEntityId())
                    .orElseThrow(()-> new IllegalArgumentException("No existe una categoría con el id"+event.getEntityId()));
            producto.categorias().remove(categoria);
        });

        apply((NombreActualizado event)->{
            producto.nombre= event.getNombre();
        });

        apply((precioActualizado event)->{
            producto.precio = event.getPrecio();
        });

        apply((CantidadProductoActualizado event)->{
            producto.cantidad = event.getCantidad();
        });

    }
}
