package com.softienda.tienda.domain.compra.commands;

import co.com.sofka.domain.generic.Command;
import com.softienda.tienda.domain.compra.values.Nacionalidad;
import com.softienda.tienda.domain.compra.values.NombreProveedor;
import com.softienda.tienda.domain.compra.values.NumeroDeContacto;
import com.softienda.tienda.domain.compra.values.ProveedorID;
import com.softienda.tienda.domain.generics.values.Direccion;

public class AgregarProveedor extends Command {
    private final ProveedorID proveedorID;
    private final NombreProveedor nombreProveedor;
    private final Direccion direccion;
    private final Nacionalidad nacionalidad;
    private final NumeroDeContacto numeroDeContacto;

    public AgregarProveedor(ProveedorID entityId, ProveedorID proveedorID, NombreProveedor nombreProveedor, Direccion direccion, Nacionalidad nacionalidad, NumeroDeContacto numeroDeContacto) {
        this.proveedorID = proveedorID;
        this.nombreProveedor = nombreProveedor;
        this.direccion = direccion;
        this.nacionalidad = nacionalidad;
        this.numeroDeContacto = numeroDeContacto;
    }

    public ProveedorID getProveedorID() {
        return proveedorID;
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
