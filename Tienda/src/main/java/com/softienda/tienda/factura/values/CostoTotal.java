package com.softienda.tienda.factura.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CostoTotal implements ValueObject<Double> {
    private final Double value;

    public CostoTotal(Double value) {
        this.value = Objects.requireNonNull(value);
        if(this.value<=0){
            throw new IllegalArgumentException("El costo total del producto no puede ser 0 menor a 0");
        }
    }

    @Override
    public Double value() {
        return value;
    }
}
