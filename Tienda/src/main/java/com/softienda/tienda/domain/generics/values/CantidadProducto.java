package com.softienda.tienda.domain.generics.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CantidadProducto implements ValueObject<Integer> {

    private final Integer value;

    public CantidadProducto(Integer value) {
        this.value = Objects.requireNonNull(value);
        if(this.value<=0){
            throw new IllegalArgumentException("La cantidad no puede ser 0 o menor a 0");
        }
    }

    @Override
    public Integer value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CantidadProducto that = (CantidadProducto) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
