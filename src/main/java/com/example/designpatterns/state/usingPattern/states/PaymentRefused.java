package com.example.designpatterns.state.usingPattern.states;

import com.example.designpatterns.state.usingPattern.PaymentStatus;

import lombok.Builder;

@Builder
public class PaymentRefused implements PaymentStatus{

    @Override
    public PaymentStatus approvePayment() {
        System.out.println("Não é possível aprovar um pagamento recusado");
        return PaymentRefused.builder().build();
    }

    @Override
    public PaymentStatus refusePayment() {
        System.out.println("Esse pedido já foi recusado anteriormente");
        return PaymentRefused.builder().build();
    }

    @Override
    public PaymentStatus sendProducts() {
        System.out.println("Não é possível enviar um pedido recusado");
        return PaymentRefused.builder().build();
    }
    
}
