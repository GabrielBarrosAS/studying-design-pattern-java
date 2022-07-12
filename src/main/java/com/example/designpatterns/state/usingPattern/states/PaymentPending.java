package com.example.designpatterns.state.usingPattern.states;

import com.example.designpatterns.state.usingPattern.PaymentStatus;

import lombok.Builder;

@Builder
public class PaymentPending implements PaymentStatus{

    @Override
    public PaymentStatus approvePayment() {
        System.out.println("Pagamento aprovado com sucesso");
        return PaymentApproved.builder().build();
    }

    @Override
    public PaymentStatus refusePayment() {
        System.out.println("Pagamento recusado");
        return PaymentRefused.builder().build();
    }

    @Override
    public PaymentStatus sendProducts() {
        System.out.println("Não é possível enviar um pedido pendente");
        return PaymentPending.builder().build();
    }
    
}
