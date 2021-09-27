package com.softienda.tienda.producto.values;

import co.com.sofka.domain.generic.Identity;

public class CategoriaID extends Identity {

    private  CategoriaID(String id){
        super(id);
    }
    public static CategoriaID of(String id){
        return  new CategoriaID(id);
    }
}
