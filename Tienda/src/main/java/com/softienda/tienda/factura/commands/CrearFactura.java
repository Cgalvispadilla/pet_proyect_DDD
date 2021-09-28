package com.softienda.tienda.factura.commands;

import co.com.sofka.domain.generic.Command;
import com.softienda.tienda.factura.Cliente;
import com.softienda.tienda.factura.Empleado;
import com.softienda.tienda.generics.values.CostoTotal;
import com.softienda.tienda.factura.values.FacturaID;
import com.softienda.tienda.factura.values.Fecha;
import com.softienda.tienda.generics.values.CantidadProducto;
import com.softienda.tienda.producto.values.ProductoID;

public class CrearFactura extends Command {
    private final FacturaID entityId;
    private final ProductoID productoID;
    private final CantidadProducto cantidadProducto;
    private final Fecha fecha;
    private final CostoTotal costoTotal;
    private final Cliente cliente;
    private final Empleado empleado;

    public CrearFactura(FacturaID entityId, ProductoID productoID, CantidadProducto cantidadProducto, Fecha fecha, CostoTotal costoTotal, Cliente cliente, Empleado empleado) {

        this.entityId = entityId;
        this.productoID = productoID;
        this.cantidadProducto = cantidadProducto;
        this.fecha = fecha;
        this.costoTotal = costoTotal;
        this.cliente = cliente;
        this.empleado = empleado;
    }

    public FacturaID getEntityId() {
        return entityId;
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
