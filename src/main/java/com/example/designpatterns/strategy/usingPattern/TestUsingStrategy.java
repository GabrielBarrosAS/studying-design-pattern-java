package com.example.designpatterns.strategy.usingPattern;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.designpatterns.strategy.usingPattern.services.DolarAmericanoService;
import com.example.designpatterns.strategy.usingPattern.services.LibraService;
import com.example.designpatterns.strategy.usingPattern.services.PesoArgentinoService;

import lombok.Data;

@Configuration
@Data
public class TestUsingStrategy implements CommandLineRunner {

    private CurrencyConverter currencyConverter;

    @Override
    public void run(String... args) throws Exception {

        System.out.println("TEST USING STRATEGY PATTERN");

        setCurrencyConverter(DolarAmericanoService.builder().build());
        currencyConverter.convertToReal(10.0);

        setCurrencyConverter(LibraService.builder().build());
        currencyConverter.convertToReal(10.0);

        setCurrencyConverter(PesoArgentinoService.builder().build());
        currencyConverter.convertToReal(10.0);

        System.out.println("END TEST\n");
    }
}
