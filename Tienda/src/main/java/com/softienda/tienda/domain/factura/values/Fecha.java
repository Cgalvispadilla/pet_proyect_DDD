package com.softienda.tienda.domain.factura.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;

public class Fecha implements ValueObject<LocalDate> {
    private final LocalDate value = LocalDate.now();
    @Override
    public LocalDate value() {
        return value;
    }
}
