package com.example.designpatterns.state.usingPattern;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.designpatterns.state.usingPattern.states.PaymentPending;

import lombok.Data;

@Configuration
@Data
public class TestUsingState implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        System.out.println("TEST USING STATE PATTERN");

        Payment payment = Payment.builder().paymentStatus(PaymentPending.builder().build()).build();

        payment.sendProducts();
        payment.approvePayment();
        payment.sendProducts();

        System.out.println("END TEST\n");
    }
    
}
