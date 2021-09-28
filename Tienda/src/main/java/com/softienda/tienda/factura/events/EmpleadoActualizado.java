package com.softienda.tienda.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.softienda.tienda.factura.values.EmpleadoID;
import com.softienda.tienda.generics.values.Email;
import com.softienda.tienda.generics.values.Nombre;
import com.softienda.tienda.generics.values.NumeroCelular;

public class EmpleadoActualizado extends DomainEvent {
    private final EmpleadoID entityId;
    private final Nombre nombre;
    private final Email email;
    private final NumeroCelular numeroCelular;

    public EmpleadoActualizado(EmpleadoID entityId, Nombre nombre, Email email, NumeroCelular numeroCelular) {
        super("tienda.factura.empleadoactualizado");
        this.entityId = entityId;
        this.nombre = nombre;
        this.email = email;
        this.numeroCelular = numeroCelular;
    }

    public EmpleadoID getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Email getEmail() {
        return email;
    }

    public NumeroCelular getNumeroCelular() {
        return numeroCelular;
    }
}
