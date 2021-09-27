package com.softienda.tienda.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.softienda.tienda.producto.values.Precio;

public class precioActualizado extends DomainEvent {


    private final Precio precio;

    public precioActualizado(Precio precio) {
        super("tienda.producto.precioactualizado");
        this.precio = precio;
    }

    public Precio getPrecio() {
        return precio;
    }
}
