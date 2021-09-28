package com.softienda.tienda.factura.commands;

import co.com.sofka.domain.generic.Command;
import com.softienda.tienda.factura.values.EmpleadoID;
import com.softienda.tienda.generics.globalvalues.Email;
import com.softienda.tienda.generics.globalvalues.Nombre;
import com.softienda.tienda.generics.globalvalues.NumeroCelular;

public class ActualizarEmpleado extends Command {
    private final EmpleadoID entityId;
    private final Nombre nombre;
    private final Email email;
    private final NumeroCelular numeroCelular;

    public ActualizarEmpleado(EmpleadoID entityId, Nombre nombre, Email email, NumeroCelular numeroCelular) {
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
