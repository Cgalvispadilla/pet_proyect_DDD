package com.softienda.tienda.domain.factura.values;

import co.com.sofka.domain.generic.Identity;


public class EmpleadoID extends Identity {
    public EmpleadoID(String id){
        super(id);
    }
    public static EmpleadoID of(String id){
        return  new EmpleadoID(id);
    }
}
