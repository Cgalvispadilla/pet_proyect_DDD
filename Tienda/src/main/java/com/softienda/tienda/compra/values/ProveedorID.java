package com.softienda.tienda.compra.values;

import co.com.sofka.domain.generic.Identity;
import com.softienda.tienda.producto.values.CategoriaID;

public class ProveedorID extends Identity {
    private  ProveedorID(String id){
        super(id);
    }
    public static ProveedorID of(String id){
        return  new ProveedorID(id);
    }
}
