package com.softienda.tienda.domain.compra.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nacionalidad implements ValueObject<String> {
    private final String value;

    public Nacionalidad(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("No se puede crear una nacionalidad vacia");
        }
        if(this.value.length()<=4){
            throw new IllegalArgumentException("La nacionalidad debe tener minimo 4 caracteres");
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
        Nacionalidad that = (Nacionalidad) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
