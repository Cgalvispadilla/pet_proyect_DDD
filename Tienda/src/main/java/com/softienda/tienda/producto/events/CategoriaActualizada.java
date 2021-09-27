package com.softienda.tienda.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.softienda.tienda.generics.globalvalues.Nombre;
import com.softienda.tienda.producto.values.CategoriaID;

public class CategoriaActualizada extends DomainEvent {
    private final CategoriaID entityId;
    private final Nombre nombre;

    public CategoriaActualizada(CategoriaID entityId, Nombre nombre) {
        super("tienda.producto.categoriaactualizada");
        this.entityId = entityId;
        this.nombre = nombre;
    }

    public CategoriaID getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
