package com.example.designpatterns.state.usingPattern.states;

import com.example.designpatterns.state.usingPattern.PaymentStatus;

import lombok.Builder;

@Builder
public class PaymentApproved implements PaymentStatus {

    @Override
    public PaymentStatus approvePayment() {
        System.out.println("Pedido foi aprovado anteriormente");
        return PaymentApproved.builder().build();
    }

    @Override
    public PaymentStatus refusePayment() {
        System.out.println("Não é possível recusar um pedido que já foi aceito");
        return PaymentApproved.builder().build();
    }

    @Override
    public PaymentStatus sendProducts() {
        System.out.println("Pedido encaminhado com sucesso");
        return PaymentSent.builder().build();
    }

}
