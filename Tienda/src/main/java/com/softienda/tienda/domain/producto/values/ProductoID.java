package com.softienda.tienda.domain.producto.values;

import co.com.sofka.domain.generic.Identity;

public class ProductoID extends Identity {

    public ProductoID(){

    }
    public ProductoID(String id){
        super(id);
    }
    public static ProductoID of(String id){
        return new ProductoID(id);
    }
}
