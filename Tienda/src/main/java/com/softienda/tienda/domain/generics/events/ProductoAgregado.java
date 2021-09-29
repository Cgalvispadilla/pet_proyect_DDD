package com.softienda.tienda.domain.generics.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.softienda.tienda.domain.producto.values.ProductoID;

public class ProductoAgregado extends DomainEvent {

    private final ProductoID productoID;

    public ProductoAgregado(ProductoID productoID) {
        super("tienda.factura.productoagregado");
        this.productoID = productoID;
    }

    public ProductoID getProductoID() {
        return productoID;
    }
}
