package com.softienda.tienda.producto.commands;

import co.com.sofka.domain.generic.Command;
import com.softienda.tienda.generics.values.Nombre;
import com.softienda.tienda.producto.values.CategoriaID;
import com.softienda.tienda.producto.values.ProductoID;

public class ActualizarCategoria extends Command {
    private final ProductoID productoID;
    private final CategoriaID entityId;
    private final Nombre nombre;

    public ActualizarCategoria(ProductoID productoID, CategoriaID entityId, Nombre nombre) {
        this.productoID = productoID;
        this.entityId = entityId;
        this.nombre = nombre;
    }

    public ProductoID getProductoID() {
        return productoID;
    }

    public CategoriaID getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
