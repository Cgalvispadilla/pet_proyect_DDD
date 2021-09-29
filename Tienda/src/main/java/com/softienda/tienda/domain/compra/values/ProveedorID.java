package com.softienda.tienda.domain.compra.values;

import co.com.sofka.domain.generic.Identity;

public class ProveedorID extends Identity {
    private  ProveedorID(String id){
        super(id);
    }
    public static ProveedorID of(String id){
        return  new ProveedorID(id);
    }
}
