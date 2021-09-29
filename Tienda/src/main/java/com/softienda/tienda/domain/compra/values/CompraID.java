package com.softienda.tienda.domain.compra.values;

import co.com.sofka.domain.generic.Identity;

public class CompraID extends Identity {
    private  CompraID(String id){
        super(id);
    }
    public static CompraID of(String id){
        return  new CompraID(id);
    }

}
