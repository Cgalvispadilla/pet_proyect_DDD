package com.softienda.tienda.factura.values;

import co.com.sofka.domain.generic.Identity;

public class ClienteID extends Identity {
    private ClienteID(String id){
        super(id);
    }
    public static ClienteID of(String id){
        return  new ClienteID(id);
    }
}
