package com.softienda.tienda.compra;

import co.com.sofka.domain.generic.EventChange;
import com.softienda.tienda.compra.events.CompraCreada;
import com.softienda.tienda.compra.events.ProveedorAgregado;
import com.softienda.tienda.compra.events.ProveedorActualizado;
import com.softienda.tienda.generics.events.CantidadProductoActualizado;
import com.softienda.tienda.generics.events.CostoTotalCalculado;
import com.softienda.tienda.generics.events.ProductoAgregado;

public class CompraChange extends EventChange {
    public CompraChange(Compra compra) {
        apply((CompraCreada event)->{
            compra.productoID= event.getProductoID();
            compra.cantidadProducto = event.getCantidadProducto();
            compra.costoTotal = event.getCostoTotal();
        });
        apply((ProveedorAgregado event)->{
            compra.proveedor = new Proveedor(event.getProveedorID(), event.getNombreProveedor(), event.getDireccion(), event.getNacionalidad(), event.getNumeroDeContacto());
        });
        apply((ProveedorActualizado event)->{
            compra.proveedor.actualizarNombreProveedor(event.getNombreProveedor());
            compra.proveedor.actualizarNacionalidad(event.getNacionalidad());
            compra.proveedor.actualizarDireccion(event.getDireccion());
            compra.proveedor.actualizarNumeroDeContacto(event.getNumeroDeContacto());
        });
        apply((ProductoAgregado event)->{
            compra.productoID = event.getProductoID();
        });
        apply((CantidadProductoActualizado event)->{
            compra.cantidadProducto = event.getCantidad();
        });
        apply((CostoTotalCalculado event)->{
            compra.costoTotal = event.getCostoTotal();
        });
    }
}

