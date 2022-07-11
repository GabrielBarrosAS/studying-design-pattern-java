package com.example.designpatterns.strategy.usingPattern.services;

import com.example.designpatterns.strategy.usingPattern.CurrencyConverter;

import lombok.Builder;

@Builder
public class DolarAmericanoService implements CurrencyConverter{

    @Override
    public Double convertToReal(Double value) {
        
        Double result = value / 5.3;
        System.out.println("Convert real to Dolar Americano = " + result);
        return result;

    }
}
