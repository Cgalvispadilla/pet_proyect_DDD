package com.softienda.tienda.domain.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.softienda.tienda.domain.generics.values.CantidadProducto;
import com.softienda.tienda.domain.generics.values.Nombre;
import com.softienda.tienda.domain.producto.values.Precio;

public class ProductoCreado extends DomainEvent {
    private final Nombre nombre;
    private final Precio precio;
    private final CantidadProducto cantidad;

    public ProductoCreado(Nombre nombre, Precio precio, CantidadProducto cantidad) {
        super("tienda.producto.productocreado");
        this.nombre=nombre;
        this.precio=precio;
        this.cantidad=cantidad;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Precio getPrecio() {
        return precio;
    }

    public CantidadProducto getCantidad() {
        return cantidad;
    }
}
