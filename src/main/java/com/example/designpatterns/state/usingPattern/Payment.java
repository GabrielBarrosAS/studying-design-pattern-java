package com.example.designpatterns.state.usingPattern;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Payment implements PaymentStatus{

    private PaymentStatus paymentStatus;

    @Override
    public PaymentStatus approvePayment() {
        paymentStatus = paymentStatus.approvePayment();
        return paymentStatus;
    }

    @Override
    public PaymentStatus refusePayment() {
        paymentStatus = paymentStatus.refusePayment();
        return paymentStatus;
    }

    @Override
    public PaymentStatus sendProducts() {
        paymentStatus = paymentStatus.sendProducts();
        return paymentStatus;
    }
    
}
