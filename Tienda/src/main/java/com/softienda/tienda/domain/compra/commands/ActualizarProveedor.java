package com.softienda.tienda.domain.compra.commands;

import co.com.sofka.domain.generic.DomainEvent;
import com.softienda.tienda.domain.compra.values.Nacionalidad;
import com.softienda.tienda.domain.compra.values.NombreProveedor;
import com.softienda.tienda.domain.compra.values.NumeroDeContacto;
import com.softienda.tienda.domain.generics.values.Direccion;

public class ActualizarProveedor extends DomainEvent {

    private final NombreProveedor nombreProveedor;
    private final Direccion direccion;
    private final Nacionalidad nacionalidad;
    private final NumeroDeContacto numeroDeContacto;

    public ActualizarProveedor(NombreProveedor nombreProveedor, Direccion direccion, Nacionalidad nacionalidad, NumeroDeContacto numeroDeContacto) {
        super("tienda.compra.proveedoreditado");

        this.nombreProveedor = nombreProveedor;
        this.direccion = direccion;
        this.nacionalidad = nacionalidad;
        this.numeroDeContacto = numeroDeContacto;
    }

    public NombreProveedor getNombreProveedor() {
        return nombreProveedor;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public Nacionalidad getNacionalidad() {
        return nacionalidad;
    }

    public NumeroDeContacto getNumeroDeContacto() {
        return numeroDeContacto;
    }
}
