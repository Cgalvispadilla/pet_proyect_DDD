package com.softienda.tienda.domain.generics.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.softienda.tienda.domain.generics.values.CantidadProducto;

public class CantidadProductoActualizado extends DomainEvent {
    private final CantidadProducto cantidad;

    public CantidadProductoActualizado(CantidadProducto cantidad) {
        super("tienda.producto.cantidadproductoactualizado");
        this.cantidad = cantidad;
    }

    public CantidadProducto getCantidad() {
        return cantidad;
    }
}
