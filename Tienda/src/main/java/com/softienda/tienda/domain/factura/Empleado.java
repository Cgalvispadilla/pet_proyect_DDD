package com.softienda.tienda.domain.factura;

import co.com.sofka.domain.generic.Entity;
import com.softienda.tienda.domain.factura.values.EmpleadoID;
import com.softienda.tienda.domain.generics.values.Email;
import com.softienda.tienda.domain.generics.values.Nombre;
import com.softienda.tienda.domain.generics.values.NumeroCelular;

import java.util.Objects;

public class Empleado extends Entity<EmpleadoID> {
    private  EmpleadoID empleadoID;
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

    public EmpleadoID empleadoID() {
        return empleadoID;
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
