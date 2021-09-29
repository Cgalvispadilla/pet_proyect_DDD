package com.softienda.tienda.domain.producto.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.softienda.tienda.domain.producto.values.CategoriaID;

public class CategoriaEliminada extends DomainEvent {
    private final CategoriaID entityId;

    public CategoriaEliminada(CategoriaID entityId) {
        super("tienda.producto.categoriaeliminada");
        this.entityId = entityId;
    }

    public CategoriaID getEntityId() {
        return entityId;
    }
}
