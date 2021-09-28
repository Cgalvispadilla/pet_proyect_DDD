package com.softienda.tienda.factura.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.softienda.tienda.factura.Cliente;
import com.softienda.tienda.factura.Empleado;
import com.softienda.tienda.generics.values.CostoTotal;
import com.softienda.tienda.factura.values.Fecha;
import com.softienda.tienda.generics.values.CantidadProducto;
import com.softienda.tienda.producto.values.ProductoID;

public class FacturaCreada extends DomainEvent {
    private final ProductoID productoID;
    private final CantidadProducto cantidadProducto;
    private final Fecha fecha;
    private final CostoTotal costoTotal;
    private final Cliente cliente;
    private final Empleado empleado;

    public FacturaCreada(ProductoID productoID, CantidadProducto cantidadProducto, Fecha fecha, CostoTotal costoTotal, Empleado empleado, Cliente cliente) {
        super("tienda.factura.facturacreada");
        this.productoID=productoID;
        this.cantidadProducto = cantidadProducto;
        this.fecha = fecha;
        this.costoTotal = costoTotal;
        this.cliente=cliente;
        this.empleado=empleado;
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

    public Cliente getCliente() {
        return cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }
}
