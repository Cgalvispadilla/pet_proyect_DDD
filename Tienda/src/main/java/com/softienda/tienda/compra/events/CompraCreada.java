package com.softienda.tienda.compra.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.softienda.tienda.generics.values.CantidadProducto;
import com.softienda.tienda.generics.values.CostoTotal;
import com.softienda.tienda.producto.values.ProductoID;

public class CompraCreada extends DomainEvent {
    private final ProductoID productoID;
    private final CantidadProducto cantidadProducto;
    private final CostoTotal costoTotal;

    public CompraCreada(ProductoID productoID, CantidadProducto cantidadProducto, CostoTotal costoTotal) {
        super("tienda.compra.compracreada");
        this.productoID = productoID;
        this.cantidadProducto = cantidadProducto;
        this.costoTotal = costoTotal;
    }

    public ProductoID getProductoID() {
        return productoID;
    }

    public CantidadProducto getCantidadProducto() {
        return cantidadProducto;
    }

    public CostoTotal getCostoTotal() {
        return costoTotal;
    }
}
