package com.softienda.tienda.domain.compra;

import co.com.sofka.domain.generic.Entity;
import com.softienda.tienda.domain.compra.values.Nacionalidad;
import com.softienda.tienda.domain.compra.values.NombreProveedor;
import com.softienda.tienda.domain.compra.values.NumeroDeContacto;
import com.softienda.tienda.domain.compra.values.ProveedorID;
import com.softienda.tienda.domain.generics.values.Direccion;

public class Proveedor extends Entity<ProveedorID> {
    private ProveedorID entityId;
    private NombreProveedor nombreProveedor;
    private Direccion direccion;
    private Nacionalidad nacionalidad;
    private NumeroDeContacto numeroDeContacto;

    public Proveedor(ProveedorID entityId,NombreProveedor nombreProveedor, Direccion direccion, Nacionalidad nacionalidad, NumeroDeContacto numeroDeContacto) {
        super(entityId);
        this.nombreProveedor = nombreProveedor;
        this.direccion = direccion;
        this.nacionalidad = nacionalidad;
        this.numeroDeContacto = numeroDeContacto;
    }

    public void actualizarNombreProveedor(NombreProveedor nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public void actualizarDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public void actualizarNacionalidad(Nacionalidad nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void actualizarNumeroDeContacto(NumeroDeContacto numeroDeContacto) {
        this.numeroDeContacto = numeroDeContacto;
    }

    public NombreProveedor nombre() {
        return nombreProveedor;
    }

    public Direccion direccion() {
        return direccion;
    }

    public Nacionalidad nacionalidad() {
        return nacionalidad;
    }

    public NumeroDeContacto numeroDeContacto() {
        return numeroDeContacto;
    }
}
