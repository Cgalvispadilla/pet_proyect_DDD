package com.softienda.tienda.domain.producto.commands;

import co.com.sofka.domain.generic.Command;
import com.softienda.tienda.domain.producto.values.CategoriaID;
import com.softienda.tienda.domain.producto.values.ProductoID;

public class EliminarCategoria extends Command {
    private final ProductoID productoID;
    private final CategoriaID entityId;

    public EliminarCategoria(ProductoID productoID, CategoriaID entityId) {
        this.productoID = productoID;
        this.entityId = entityId;
    }

    public ProductoID getProductoID() {
        return productoID;
    }

    public CategoriaID getEntityId() {
        return entityId;
    }
}
