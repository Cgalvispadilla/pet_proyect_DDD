package com.softienda.tienda.factura.commands;

import co.com.sofka.domain.generic.Command;
import com.softienda.tienda.producto.values.ProductoID;

public class AgregarProducto extends Command {
    private final ProductoID productoID;

    public AgregarProducto(ProductoID productoID) {
        this.productoID = productoID;
    }

    public ProductoID getProductoID() {
        return productoID;
    }
}
