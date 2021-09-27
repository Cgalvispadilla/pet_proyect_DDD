package com.softienda.tienda.factura;

import co.com.sofka.domain.generic.AggregateEvent;
import com.softienda.tienda.producto.values.ProductoID;
import com.softienda.tienda.generics.globalvalues.CantidadProducto;
import com.softienda.tienda.factura.values.CostoTotal;
import com.softienda.tienda.factura.values.FacturaID;
import com.softienda.tienda.factura.values.Fecha;

public class Factura extends AggregateEvent<FacturaID> {

    protected ProductoID productoID;
    protected CantidadProducto cantidadProducto;
    protected Fecha fecha;
    protected CostoTotal costoTotal;
    public Factura(FacturaID entityId, ProductoID productoID, CantidadProducto cantidadProducto, Fecha fecha, CostoTotal costoTotal) {
        super(entityId);

    }
}
