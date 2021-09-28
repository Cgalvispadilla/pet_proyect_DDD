package com.softienda.tienda.generics.commands;

import co.com.sofka.domain.generic.Command;
import com.softienda.tienda.generics.values.CantidadProducto;

public class ActualizarCantidadProducto extends Command {
    private final CantidadProducto cantidad;

    public ActualizarCantidadProducto(CantidadProducto cantidad) {
        this.cantidad = cantidad;
    }

    public CantidadProducto getCantidad() {
        return cantidad;
    }
}
