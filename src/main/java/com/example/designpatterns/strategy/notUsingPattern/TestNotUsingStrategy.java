package com.example.designpatterns.strategy.notUsingPattern;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestNotUsingStrategy implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        System.out.println("TEST NOT USING STRATEGY PATTERN");

        CurrencyConverter.convertBrazilianReal("PesoArgentino", 10.0);
        CurrencyConverter.convertBrazilianReal("FrancoSuíço", 10.0);
        CurrencyConverter.convertBrazilianReal("Libra", 10.0);
        CurrencyConverter.convertBrazilianReal("Euro", 10.0);
        CurrencyConverter.convertBrazilianReal("DólarAmericano", 10.0);
        CurrencyConverter.convertBrazilianReal(null, 10.0);
        CurrencyConverter.convertBrazilianReal("a", 10.0);

        System.out.println("END TEST\n");

    }
}
