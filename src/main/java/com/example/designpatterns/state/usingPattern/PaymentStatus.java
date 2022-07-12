package com.example.designpatterns.state.usingPattern;

public interface PaymentStatus {
    public PaymentStatus approvePayment();

    public PaymentStatus refusePayment();

    public PaymentStatus sendProducts();
}
