package com.example.designpatterns.state.usingPattern.states;

import com.example.designpatterns.state.usingPattern.PaymentStatus;
import com.example.designpatterns.state.usingPattern.Status;

public class PaymentRefused implements PaymentStatus{

    @Override
    public Status approvePayment() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Status refusePayment() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Status sendProducts() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
