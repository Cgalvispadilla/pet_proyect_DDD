package com.softienda.tienda.domain.compra.commands;

import co.com.sofka.domain.generic.Command;
import com.softienda.tienda.domain.compra.values.CompraID;
import com.softienda.tienda.domain.generics.values.CantidadProducto;
import com.softienda.tienda.domain.generics.values.CostoTotal;
import com.softienda.tienda.domain.producto.values.ProductoID;

public class CrearCompra extends Command {
    private final CompraID entityId;
    private final ProductoID productoID;
    private final CantidadProducto cantidadProducto;
    private final CostoTotal costoTotal;

    public CrearCompra(CompraID entityId,ProductoID productoID, CantidadProducto cantidadProducto, CostoTotal costoTotal) {
        this.entityId = entityId;
        this.productoID = productoID;
        this.cantidadProducto = cantidadProducto;
        this.costoTotal = costoTotal;
    }

    public CompraID getEntityId() {
        return entityId;
    }

    public ProductoID getProductoID() {
        return productoID;
    }

    public CantidadProducto getCantidadProducto() {
        return cantidadProducto;
    }

    public CostoTotal getCostoTotal() {
        return costoTotal;
    }
}
