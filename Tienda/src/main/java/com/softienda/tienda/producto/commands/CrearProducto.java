package com.softienda.tienda.producto.commands;

import co.com.sofka.domain.generic.Command;
import com.softienda.tienda.generics.globalvalues.CantidadProducto;
import com.softienda.tienda.generics.globalvalues.Nombre;
import com.softienda.tienda.producto.values.Precio;
import com.softienda.tienda.producto.values.ProductoID;

public class CrearProducto extends Command {
    private final ProductoID productoID;
    private final Nombre nombre;
    private final Precio precio;
    private final CantidadProducto cantidad;

    public CrearProducto(ProductoID entityId, Nombre nombre, Precio precio, CantidadProducto cantidad) {
        this.productoID = entityId;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public ProductoID getProductoID() {
        return productoID;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Precio getPrecio() {
        return precio;
    }

    public CantidadProducto getCantidad() {
        return cantidad;
    }
}
