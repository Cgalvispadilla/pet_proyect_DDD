package com.softienda.tienda.compra;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.softienda.tienda.compra.events.CompraCreada;
import com.softienda.tienda.compra.events.ProveedorAgregado;
import com.softienda.tienda.compra.events.ProveedorActualizado;
import com.softienda.tienda.compra.values.*;
import com.softienda.tienda.generics.events.ProductoAgregado;
import com.softienda.tienda.generics.events.CantidadProductoActualizado;
import com.softienda.tienda.generics.events.CostoTotalCalculado;
import com.softienda.tienda.generics.values.CantidadProducto;
import com.softienda.tienda.generics.values.CostoTotal;
import com.softienda.tienda.generics.values.Direccion;
import com.softienda.tienda.producto.values.ProductoID;

import java.util.List;
import java.util.Objects;

public class Compra extends AggregateEvent<CompraID> {
    protected CompraID compraID;
    protected ProductoID productoID;
    protected CantidadProducto cantidadProducto;
    protected CostoTotal costoTotal;
    protected Proveedor proveedor;

    public Compra(CompraID entityId, ProductoID productoID, CantidadProducto cantidadProducto, CostoTotal costoTotal) {
        super(entityId);
        appendChange(new CompraCreada(productoID,cantidadProducto, costoTotal)).apply();
    }
    private Compra(CompraID compraID){
        super(compraID);
        subscribe(new CompraChange(this));
    }
    public static Compra from(CompraID compraID, List<DomainEvent> events){
        Compra compra = new Compra(compraID);
        events.forEach(compra::applyEvent);
        return compra;
    }
    public void agregarProveedor(ProveedorID entityId, ProveedorID proveedorID, NombreProveedor nombreProveedor, Direccion direccion, Nacionalidad nacionalidad, NumeroDeContacto numeroDeContacto){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(proveedorID);
        Objects.requireNonNull(nombreProveedor);
        Objects.requireNonNull(direccion);
        Objects.requireNonNull(nacionalidad);
        Objects.requireNonNull(numeroDeContacto);
        appendChange(new ProveedorAgregado(entityId, proveedorID,nombreProveedor, direccion, nacionalidad, numeroDeContacto)).apply();
    }
    public void ActualizarProveedor( ProveedorID proveedorID, NombreProveedor nombreProveedor, Direccion direccion, Nacionalidad nacionalidad, NumeroDeContacto numeroDeContacto){
        Objects.requireNonNull(nombreProveedor);
        Objects.requireNonNull(direccion);
        Objects.requireNonNull(nacionalidad);
        Objects.requireNonNull(numeroDeContacto);
        appendChange(new ProveedorActualizado(nombreProveedor, direccion, nacionalidad, numeroDeContacto)).apply();
    }

    public void  agregarProducto(ProductoID productoID){
        Objects.requireNonNull(productoID);
        appendChange(new ProductoAgregado(productoID)).apply();
    }
    public void actualizarCantidadProducto(CantidadProducto cantidad){
        Objects.requireNonNull(cantidad);
        appendChange(new CantidadProductoActualizado(cantidad));
    }
    public void calcularCostoTotal(CostoTotal costoTotal){
        Objects.requireNonNull(costoTotal);
        appendChange(new CostoTotalCalculado(costoTotal));
    }


    public ProductoID productoID() {
        return productoID;
    }

    public CantidadProducto cantidadProducto() {
        return cantidadProducto;
    }

    public CostoTotal costoTotal() {
        return costoTotal;
    }

    public Proveedor proveedor() {
        return proveedor;
    }
}
