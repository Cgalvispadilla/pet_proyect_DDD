package com.softienda.tienda.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.softienda.tienda.generics.globalvalues.Nombre;

public class NombreActualizado extends DomainEvent {
    private final Nombre nombre;

    public NombreActualizado(Nombre nombre) {
        super("tienda.producto.nombreactualizado");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
