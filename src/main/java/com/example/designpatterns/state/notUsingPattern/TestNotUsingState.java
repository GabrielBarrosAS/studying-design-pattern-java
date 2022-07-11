package com.example.designpatterns.state.notUsingPattern;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestNotUsingState implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        System.out.println("TEST NOT USING STATE PATTERN");

        Payment payment = Payment.builder().build();

        payment.sendProducts();
        payment.refusePayment();
        payment.sendProducts();

        Payment payment2 = Payment.builder().build();

        payment2.sendProducts();
        payment2.approvePayment();
        payment2.refusePayment();
        payment2.approvePayment();
        payment2.sendProducts();

        System.out.println("END TEST\n");
    }
}
