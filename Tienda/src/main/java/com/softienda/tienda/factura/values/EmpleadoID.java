package com.softienda.tienda.factura.values;

import co.com.sofka.domain.generic.Identity;


public class EmpleadoID extends Identity {
    private  EmpleadoID(String id){
        super(id);
    }
    public static EmpleadoID of(String id){
        return  new EmpleadoID(id);
    }
}
