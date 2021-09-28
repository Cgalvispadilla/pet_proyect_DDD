package com.softienda.tienda.factura;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.domain.generic.Identity;
import com.softienda.tienda.factura.values.EmpleadoID;
import com.softienda.tienda.generics.globalvalues.Direccion;
import com.softienda.tienda.generics.globalvalues.Email;
import com.softienda.tienda.generics.globalvalues.Nombre;
import com.softienda.tienda.generics.globalvalues.NumeroCelular;

import java.util.Objects;

public class Empleado extends Entity<EmpleadoID> {

    private Nombre nombre;
    private Email email;
    private NumeroCelular numeroCelular;

    public Empleado(EmpleadoID entityId, Nombre nombre, Email email, NumeroCelular numeroCelular) {
        super(entityId);
        this.nombre = nombre;
        this.email = email;
        this.numeroCelular = numeroCelular;
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

    public Nombre nombre() {
        return nombre;
    }

    public Email email() {
        return email;
    }

    public NumeroCelular numeroCelular() {
        return numeroCelular;
    }
}
