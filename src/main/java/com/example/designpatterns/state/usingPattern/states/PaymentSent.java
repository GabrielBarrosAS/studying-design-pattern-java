package com.example.designpatterns.state.usingPattern.states;

import com.example.designpatterns.state.usingPattern.PaymentStatus;

import lombok.Builder;

@Builder
public class PaymentSent implements PaymentStatus {

    @Override
    public PaymentStatus approvePayment() {
        System.out.println("Não é possível aprovar novamente um pedido que foi enviado");
        return PaymentSent.builder().build();
    }

    @Override
    public PaymentStatus refusePayment() {
        System.out.println("Não é possível recusar um pedido já enviado");
        return PaymentSent.builder().build();
    }

    @Override
    public PaymentStatus sendProducts() {
        System.out.println("Não é possível enviar novamente um pedido que já foi enviado");
        return PaymentSent.builder().build();
    }

}
