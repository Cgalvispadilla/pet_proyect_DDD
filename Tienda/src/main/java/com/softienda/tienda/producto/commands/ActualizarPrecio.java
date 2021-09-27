package com.softienda.tienda.producto.commands;

import co.com.sofka.domain.generic.Command;
import com.softienda.tienda.producto.values.Precio;
import com.softienda.tienda.producto.values.ProductoID;

public class ActualizarPrecio extends Command {
    private final ProductoID productoID;
    private final Precio precio;

    public ActualizarPrecio(ProductoID productoID, Precio precio) {
        this.productoID = productoID;
        this.precio = precio;
    }

    public ProductoID getProductoID() {
        return productoID;
    }

    public Precio getPrecio() {
        return precio;
    }
}
