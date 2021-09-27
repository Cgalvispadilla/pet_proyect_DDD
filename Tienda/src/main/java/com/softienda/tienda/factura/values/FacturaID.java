package com.softienda.tienda.factura.values;


import co.com.sofka.domain.generic.Identity;

public class FacturaID extends Identity {
    private FacturaID(String id){
        super(id);
    }
    public static FacturaID of(String id){
        return  new FacturaID(id);
    }
}
