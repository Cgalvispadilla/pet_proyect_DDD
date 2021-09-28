package com.softienda.tienda.factura;

import co.com.sofka.domain.generic.EventChange;
import com.softienda.tienda.factura.events.*;
import com.softienda.tienda.generics.events.CantidadProductoActualizado;
import com.softienda.tienda.generics.events.CostoTotalCalculado;
import com.softienda.tienda.generics.events.ProductoAgregado;

public class FacturaChange extends EventChange {
    public FacturaChange(Factura factura) {
        apply((FacturaCreada event)->{
            factura.productoID = event.getProductoID();
            factura.cantidadProducto=event.getCantidadProducto();
            factura.costoTotal=event.getCostoTotal();
            factura.fecha = event.getFecha();
            factura.cliente = event.getCliente();
            factura.empleado = event.getEmpleado();
        });
        apply((ProductoAgregado event)->{
            factura.productoID = event.getProductoID();
        });
        apply((ClienteActualizado event)->{
            factura.cliente.actualizarNombre(event.getNombre());
            factura.cliente.actualizarDireccion(event.getDireccion());
            factura.cliente.actualizarEmail(event.getEmail());
            factura.cliente.actualizarNumeroCelular(event.getNumeroCelular());
        });
        apply((EmpleadoActualizado event)->{
            factura.empleado.actualizarNombre(event.getNombre());
            factura.empleado.actualizarEmail(event.getEmail());
            factura.empleado.actualizarNumeroCelular(event.getNumeroCelular());
        });
        apply((CantidadProductoActualizado event)->{
            factura.cantidadProducto = event.getCantidad();
        });
        apply((CostoTotalCalculado event)->{
            factura.costoTotal = event.getCostoTotal();
        });
        apply((FechaAsignada event)->{
            factura.fecha=event.getFecha();
        });

    }
}
