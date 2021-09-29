package com.softienda.tienda.domain.factura.commands;

import co.com.sofka.domain.generic.Command;
import com.softienda.tienda.domain.factura.Cliente;
import com.softienda.tienda.domain.generics.values.Direccion;
import com.softienda.tienda.domain.generics.values.Email;
import com.softienda.tienda.domain.generics.values.Nombre;
import com.softienda.tienda.domain.generics.values.NumeroCelular;

public class ActualizarCliente extends Command {
    private final Cliente entityId;
    private final Nombre nombre;
    private final Email email;
    private final NumeroCelular numeroCelular;
    private final Direccion direccion;

    public ActualizarCliente(Cliente entityId, Nombre nombre, Email email, NumeroCelular numeroCelular, Direccion direccion) {
        this.entityId = entityId;
        this.nombre = nombre;
        this.email = email;
        this.numeroCelular = numeroCelular;
        this.direccion = direccion;
    }

    public Cliente getEntityId() {
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

    public Direccion getDireccion() {
        return direccion;
    }
}
