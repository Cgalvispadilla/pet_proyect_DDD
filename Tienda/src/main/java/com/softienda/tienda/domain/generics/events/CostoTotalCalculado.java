package com.softienda.tienda.domain.generics.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.softienda.tienda.domain.generics.values.CostoTotal;

public class CostoTotalCalculado extends DomainEvent {


    private final CostoTotal costoTotal;

    public CostoTotalCalculado(CostoTotal costoTotal) {
        super("tienda.factura.costototalcalculado");
        this.costoTotal = costoTotal;
    }

    public CostoTotal getCostoTotal() {
        return costoTotal;
    }
}



