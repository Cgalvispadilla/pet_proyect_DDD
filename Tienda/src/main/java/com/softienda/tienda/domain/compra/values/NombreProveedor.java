package com.softienda.tienda.domain.compra.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreProveedor implements ValueObject<String> {
    private final String value;

    public NombreProveedor(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El nombre del proveedor no debe estar vacio");
        }
        if(this.value.length()<=4){
            throw new IllegalArgumentException("El nombre debe tener minimo 4 caracteres");
        }
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NombreProveedor that = (NombreProveedor) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
