package com.softienda.tienda.domain.factura;

import co.com.sofka.domain.generic.Entity;
import com.softienda.tienda.domain.factura.values.ClienteID;
import com.softienda.tienda.domain.generics.values.Direccion;
import com.softienda.tienda.domain.generics.values.Email;
import com.softienda.tienda.domain.generics.values.Nombre;
import com.softienda.tienda.domain.generics.values.NumeroCelular;

import java.util.Objects;

public class Cliente extends Entity<ClienteID> {

    private ClienteID clienteID;
    private Nombre nombre;
    private Email email;
    private NumeroCelular numeroCelular;
    private Direccion direccion;


    public Cliente(ClienteID entityId, Nombre nombre, Email email, NumeroCelular numeroCelular, Direccion direccion) {
        super(entityId);
        this.nombre = nombre;
        this.email = email;
        this.numeroCelular = numeroCelular;
        this.direccion = direccion;
    }

    public void actualizarNombre(Nombre nombre) {
        this.nombre = Objects.requireNonNull(nombre);
    }

    public void actualizarEmail(Email email) {
        this.email = Objects.requireNonNull(email);
    }

    public void actualizarNumeroCelular(NumeroCelular numeroCelular) {
        this.numeroCelular = Objects.requireNonNull(numeroCelular);
    }
    public void actualizarDireccion(Direccion direccion) {
        this.direccion = Objects.requireNonNull(direccion);
    }
    public Nombre nombre() {
        return nombre;
    }

    public ClienteID clienteID() {
        return clienteID;
    }

    public Email email() {
        return email;
    }

    public NumeroCelular numeroCelular() {
        return numeroCelular;
    }

    public Direccion direccion() {
        return direccion;
    }
}
