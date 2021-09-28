package com.softienda.tienda.factura.commands;

import co.com.sofka.domain.generic.Command;
import com.softienda.tienda.generics.globalvalues.CantidadProducto;

public class ActualizarCantidadProducto extends Command {
    private final CantidadProducto cantidad;

    public ActualizarCantidadProducto(CantidadProducto cantidad) {
        this.cantidad = cantidad;
    }

    public CantidadProducto getCantidad() {
        return cantidad;
    }
}
