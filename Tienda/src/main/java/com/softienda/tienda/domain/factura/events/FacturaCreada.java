package com.softienda.tienda.domain.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.softienda.tienda.domain.factura.values.ClienteID;
import com.softienda.tienda.domain.factura.values.EmpleadoID;
import com.softienda.tienda.domain.generics.values.CostoTotal;
import com.softienda.tienda.domain.factura.values.Fecha;
import com.softienda.tienda.domain.generics.values.CantidadProducto;
import com.softienda.tienda.domain.producto.values.ProductoID;

public class FacturaCreada extends DomainEvent {
    private final ProductoID productoID;
    private final CantidadProducto cantidadProducto;
    private final Fecha fecha;
    private final CostoTotal costoTotal;
    private final ClienteID clienteID;
    private final EmpleadoID empleadoID;

    public FacturaCreada(ProductoID productoID, CantidadProducto cantidadProducto, Fecha fecha, CostoTotal costoTotal, EmpleadoID empleadoID, ClienteID clienteID) {
        super("tienda.factura.facturacreada");
        this.productoID=productoID;
        this.cantidadProducto = cantidadProducto;
        this.fecha = fecha;
        this.costoTotal = costoTotal;
        this.clienteID=clienteID;
        this.empleadoID=empleadoID;
    }

    public ProductoID getProductoID() {
        return productoID;
    }

    public CantidadProducto getCantidadProducto() {
        return cantidadProducto;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public CostoTotal getCostoTotal() {
        return costoTotal;
    }

    public ClienteID getClienteID() {
        return clienteID;
    }

    public EmpleadoID getEmpleadoID() {
        return empleadoID;
    }
}
