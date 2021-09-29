package com.softienda.tienda.domain.factura;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.softienda.tienda.domain.factura.events.*;
import com.softienda.tienda.domain.factura.values.ClienteID;
import com.softienda.tienda.domain.factura.values.EmpleadoID;
import com.softienda.tienda.domain.generics.events.CostoTotalCalculado;
import com.softienda.tienda.domain.generics.events.ProductoAgregado;
import com.softienda.tienda.domain.generics.values.*;
import com.softienda.tienda.domain.generics.events.CantidadProductoActualizado;
import com.softienda.tienda.domain.producto.values.ProductoID;
import com.softienda.tienda.domain.generics.values.CostoTotal;
import com.softienda.tienda.domain.factura.values.FacturaID;
import com.softienda.tienda.domain.factura.values.Fecha;

import java.util.List;
import java.util.Objects;

public class Factura extends AggregateEvent<FacturaID> {

    public Cliente cliente;
    public Empleado empleado;
    protected ProductoID productoID;
    protected CantidadProducto cantidadProducto;
    protected Fecha fecha;
    protected CostoTotal costoTotal;
    protected EmpleadoID empleadoID;
    protected  ClienteID clienteID;

    public Factura(FacturaID entityId, ProductoID productoID, CantidadProducto cantidadProducto, Fecha fecha, CostoTotal costoTotal, ClienteID clienteID, EmpleadoID empleadoID) {
        super(entityId);
        Objects.requireNonNull(productoID);
        Objects.requireNonNull(cantidadProducto);
        Objects.requireNonNull(fecha);
        Objects.requireNonNull(cantidadProducto);
        Objects.requireNonNull(clienteID);
        Objects.requireNonNull(empleadoID);
        appendChange(new FacturaCreada(productoID, cantidadProducto, fecha,costoTotal, empleadoID, clienteID)).apply();
    }
    private Factura(FacturaID facturaID){
        super(facturaID);
        subscribe(new FacturaChange(this));
    }

    public static Factura from(FacturaID facturaID, List<DomainEvent> events){
        Factura factura= new Factura(facturaID);
        events.forEach(factura::applyEvent);
        return factura;
    }

    public void  agregarProducto(ProductoID productoID){
        Objects.requireNonNull(productoID);
        appendChange(new ProductoAgregado(productoID)).apply();
    }
    public  void actualizarEmpleado(EmpleadoID entityId, Nombre nombre, Email email, NumeroCelular numeroCelular){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(email);
        Objects.requireNonNull(numeroCelular);
        appendChange(new EmpleadoActualizado(entityId, nombre,email,numeroCelular)).apply();
    }
    public  void actualizarCliente(Cliente entityId, Nombre nombre, Email email, NumeroCelular numeroCelular, Direccion direccion){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(email);
        Objects.requireNonNull(numeroCelular);
        Objects.requireNonNull(direccion);
        appendChange(new ClienteActualizado(entityId, nombre,email,numeroCelular, direccion)).apply();
    }
    public void actualizarCantidadProducto(CantidadProducto cantidad){
        Objects.requireNonNull(cantidad);
        appendChange(new CantidadProductoActualizado(cantidad));
    }
    public void calcularCostoTotal(CostoTotal costoTotal){
        Objects.requireNonNull(costoTotal);
        appendChange(new CostoTotalCalculado(costoTotal));
    }

    public void asignarFecha(Fecha fecha){
        Objects.requireNonNull(fecha);
        appendChange(new FechaAsignada(fecha)).apply();
    }

    public ProductoID productoID() {
        return productoID;
    }

    public CantidadProducto cantidadProducto() {
        return cantidadProducto;
    }

    public Fecha fecha() {
        return fecha;
    }

    public CostoTotal costoTotal() {
        return costoTotal;
    }

    public Cliente cliente() {
        return cliente;
    }

    public Empleado empleado() {
        return empleado;
    }

    public void asignarBono(Double bono) {
        appendChange(new BonoAsignado(bono)).apply();
    }
}
