package com.softienda.tienda.producto.commands;

import co.com.sofka.domain.generic.Command;
import com.softienda.tienda.generics.values.Nombre;
import com.softienda.tienda.producto.values.ProductoID;

public class ActualizarNombre extends Command {

    private final ProductoID productoID;
    private final Nombre nombre;

    public ActualizarNombre(ProductoID productoID, Nombre nombre) {
        this.productoID = productoID;
        this.nombre = nombre;
    }

    public ProductoID getProductoID() {
        return productoID;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
