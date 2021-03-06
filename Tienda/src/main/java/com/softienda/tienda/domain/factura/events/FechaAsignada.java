package com.softienda.tienda.domain.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.softienda.tienda.domain.factura.values.Fecha;

public class FechaAsignada extends DomainEvent {
    private final Fecha fecha;

    public FechaAsignada(Fecha fecha) {
        super("tienda.factura.fechaasignada");
        this.fecha = fecha;
    }

    public Fecha getFecha() {
        return fecha;
    }


}
