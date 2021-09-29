package com.softienda.tienda.domain.generics.commands;

import co.com.sofka.domain.generic.Command;
import com.softienda.tienda.domain.generics.values.CantidadProducto;
import com.softienda.tienda.domain.producto.values.ProductoID;

public class CalcularCostoTotal extends Command {
    private final ProductoID productoID;
    private final CantidadProducto cantidadProducto;

    public CalcularCostoTotal(ProductoID productoID, CantidadProducto cantidadProducto) {
        this.productoID = productoID;
        this.cantidadProducto = cantidadProducto;
    }

    public ProductoID getProductoID() {
        return productoID;
    }

    public CantidadProducto getCantidadProducto() {
        return cantidadProducto;
    }
}
