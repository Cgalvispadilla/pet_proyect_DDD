package com.softienda.tienda.domain.producto.commands;

import co.com.sofka.domain.generic.Command;
import com.softienda.tienda.domain.generics.values.CantidadProducto;
import com.softienda.tienda.domain.producto.values.ProductoID;

public class ActualizarCantidad extends Command {
    private final ProductoID productoID;
    private final CantidadProducto cantidad;

    public ActualizarCantidad(ProductoID productoID,CantidadProducto cantidad) {
        this.productoID = productoID;
        this.cantidad = cantidad;
    }

    public ProductoID getProductoID() {
        return productoID;
    }

    public CantidadProducto getCantidad() {
        return cantidad;
    }
}
