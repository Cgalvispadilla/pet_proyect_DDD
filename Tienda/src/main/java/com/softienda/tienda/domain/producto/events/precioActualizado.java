package com.softienda.tienda.domain.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.softienda.tienda.domain.producto.values.Precio;

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
