package com.softienda.tienda.factura;

import co.com.sofka.domain.generic.Entity;
import com.softienda.tienda.factura.values.ClienteID;
import com.softienda.tienda.generics.values.Direccion;
import com.softienda.tienda.generics.values.Email;
import com.softienda.tienda.generics.values.Nombre;
import com.softienda.tienda.generics.values.NumeroCelular;

import java.util.Objects;

public class Cliente extends Entity<ClienteID> {
    private Nombre nombre;
    private Email email;
    private NumeroCelular numeroCelular;
    private Direccion direccion;
    private Empleado empleado;
    private Cliente cliente;

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
