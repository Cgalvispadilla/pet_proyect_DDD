package com.softienda.tienda.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.softienda.tienda.factura.values.CostoTotal;
import com.softienda.tienda.generics.globalvalues.CantidadProducto;
import com.softienda.tienda.producto.values.ProductoID;

import java.util.List;

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



