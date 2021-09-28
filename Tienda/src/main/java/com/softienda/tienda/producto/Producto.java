package com.softienda.tienda.producto;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.softienda.tienda.generics.events.CantidadProductoActualizado;
import com.softienda.tienda.generics.events.NombreActualizado;
import com.softienda.tienda.generics.values.CantidadProducto;
import com.softienda.tienda.generics.values.Nombre;
import com.softienda.tienda.producto.events.*;
import com.softienda.tienda.producto.values.CategoriaID;
import com.softienda.tienda.producto.values.Precio;
import com.softienda.tienda.producto.values.ProductoID;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Producto extends AggregateEvent<ProductoID> {
    protected ProductoID productoID;
    protected Nombre nombre;
    protected CantidadProducto cantidad;
    protected Precio precio;
    protected Set<Categoria> categorias;

    public Producto(ProductoID entityId, Nombre nombre, Precio precio, CantidadProducto cantidad) {
        super(entityId);
        appendChange(new ProductoCreado(nombre, precio, cantidad)).apply();
    }
    private Producto (ProductoID productoID){
        super(productoID);
        subscribe(new ProductoChange(this));
    }
    public static  Producto from(ProductoID productoID, List<DomainEvent> events){
        Producto producto = new Producto(productoID);
        events.forEach(producto::applyEvent);
        return producto;
    }

    public void agregarCategoria(CategoriaID entityId, Nombre nombre) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        appendChange(new CategoriaAgregada(entityId, nombre)).apply();
    }

    public void actualizarCategoria(CategoriaID entityId, Nombre nombre) {
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        appendChange(new CategoriaActualizada(entityId, nombre)).apply();
    }

    public void eliminarCategoria(CategoriaID entityId) {
        Objects.requireNonNull(entityId);
        appendChange(new CategoriaEliminada(entityId)).apply();
    }

    public void actualizarNombre(Nombre nombre) {
        Objects.requireNonNull(nombre);
        appendChange(new NombreActualizado(nombre)).apply();
    }

    public void actualizarCantidad(CantidadProducto cantidad) {
        Objects.requireNonNull(cantidad);
        appendChange(new CantidadProductoActualizado(cantidad)).apply();
    }

    public void actualizarPrecio(Precio precio) {
        Objects.requireNonNull(precio);
        appendChange(new precioActualizado(precio)).apply();
    }
    public Optional<Categoria> getCategoriaPorId(CategoriaID categoriaID) {
        return categorias().stream()
                .filter(categoria -> categoria.identity().equals(categoriaID))
                .findFirst();
    }

    public Nombre nombre() {
        return nombre;
    }

    public CantidadProducto cantidad() {
        return cantidad;
    }

    public Precio precio() {
        return precio;
    }

    public Set<Categoria> categorias() {
        return categorias;
    }


}
