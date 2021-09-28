package com.softienda.tienda.factura.commands;

import co.com.sofka.domain.generic.Command;
import com.softienda.tienda.factura.values.Fecha;

public class AsignarFecha extends Command {
    private final Fecha fecha;

    public AsignarFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
