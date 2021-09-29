package com.softienda.tienda.domain.compra.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NumeroDeContacto implements ValueObject<String> {
    private final String value;

    public NumeroDeContacto(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El numero de contacto no debe estar vacio");
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
        NumeroDeContacto that = (NumeroDeContacto) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
