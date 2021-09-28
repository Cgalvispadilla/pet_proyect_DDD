package com.softienda.tienda.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.softienda.tienda.generics.values.Nombre;
import com.softienda.tienda.producto.values.CategoriaID;

public class CategoriaAgregada extends DomainEvent {
    private final CategoriaID entityId;
    private final Nombre nombre;

    public CategoriaAgregada(CategoriaID entityId, Nombre nombre) {
        super("tienda.producto.categoriaagregada");
        this.entityId = entityId;
        this.nombre = nombre;
    }

    public CategoriaID getCategoriaId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
