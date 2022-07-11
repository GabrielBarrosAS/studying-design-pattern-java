package com.example.designpatterns.strategy.usingPattern.services;

import com.example.designpatterns.strategy.usingPattern.CurrencyConverter;

import lombok.Builder;

@Builder
public class LibraService implements CurrencyConverter {

    @Override
    public Double convertToReal(Double value) {

        Double result = value / 6.36;
        System.out.println("Convert real to Dolar Americano = " + result);
        return result;

    }
}
