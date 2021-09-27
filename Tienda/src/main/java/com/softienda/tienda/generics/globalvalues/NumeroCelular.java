package com.softienda.tienda.generics.globalvalues;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NumeroCelular implements ValueObject<NumeroCelular.Props> {
    private final String prefijo;
    private final String numero;

    public NumeroCelular(String value, String prefijo) {
        this.prefijo = Objects.requireNonNull(prefijo);
        this.numero = Objects.requireNonNull(value);
        if(this.numero.isBlank()){
            throw new IllegalArgumentException("El numero de celular no puede estar vacio");
        }
        if(this.numero.length()!=10){
            throw new IllegalArgumentException("El numero de celular debe tener 10 digitos");
        }
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String prefijo() {
                return prefijo;
            }

            @Override
            public String numero() {
                return numero;
            }
        };
    }

    public  interface  Props{
            String prefijo();
            String numero();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumeroCelular that = (NumeroCelular) o;
        return Objects.equals(prefijo, that.prefijo) && Objects.equals(numero, that.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }
}
