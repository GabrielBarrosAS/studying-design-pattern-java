package com.example.designpatterns.state.usingPattern;

public interface PaymentStatus {
    public Status approvePayment();

    public Status refusePayment();

    public Status sendProducts();
}
