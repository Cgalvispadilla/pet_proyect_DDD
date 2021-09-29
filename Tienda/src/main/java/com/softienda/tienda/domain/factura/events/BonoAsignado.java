package com.softienda.tienda.domain.factura.events;

import co.com.sofka.domain.generic.DomainEvent;

public class BonoAsignado extends DomainEvent {
    private final Double bono;

    public BonoAsignado(Double bono) {
        super("tienda.factura.bonoasignado");
        this.bono = bono;
    }

    public Double getBono() {
        return bono;
    }
}
