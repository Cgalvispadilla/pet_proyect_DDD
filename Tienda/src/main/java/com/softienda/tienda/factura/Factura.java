package com.softienda.tienda.factura;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.softienda.tienda.factura.events.*;
import com.softienda.tienda.factura.values.EmpleadoID;
import com.softienda.tienda.generics.globalvalues.*;
import com.softienda.tienda.generics.globalevents.CantidadProductoActualizado;
import com.softienda.tienda.producto.values.ProductoID;
import com.softienda.tienda.factura.values.CostoTotal;
import com.softienda.tienda.factura.values.FacturaID;
import com.softienda.tienda.factura.values.Fecha;

import java.util.List;
import java.util.Objects;

public class Factura extends AggregateEvent<FacturaID> {

    protected ProductoID productoID;
    protected CantidadProducto cantidadProducto;
    protected Fecha fecha;
    protected CostoTotal costoTotal;
    protected Empleado empleado;
    protected Cliente cliente;
    public Factura(FacturaID entityId, ProductoID productoID, CantidadProducto cantidadProducto, Fecha fecha, CostoTotal costoTotal, Cliente cliente, Empleado empleado) {
        super(entityId);
        Objects.requireNonNull(productoID);
        Objects.requireNonNull(cantidadProducto);
        Objects.requireNonNull(fecha);
        Objects.requireNonNull(cantidadProducto);
        Objects.requireNonNull(cliente);
        Objects.requireNonNull(empleado);
        appendChange(new FacturaCreada(productoID, cantidadProducto, fecha,costoTotal, empleado, cliente)).apply();
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

    public Empleado empleado() {
        return empleado;
    }

    public Cliente cliente() {
        return cliente;
    }
}
