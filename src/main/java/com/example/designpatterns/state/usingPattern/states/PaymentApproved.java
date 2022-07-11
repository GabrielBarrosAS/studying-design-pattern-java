package com.example.designpatterns.state.usingPattern.states;

import com.example.designpatterns.state.usingPattern.PaymentStatus;
import com.example.designpatterns.state.usingPattern.Status;

public class PaymentApproved implements PaymentStatus{

    @Override
    public Status approvePayment() {
        
        return null;
    }

    @Override
    public Status refusePayment() {

        return null;
    }

    @Override
    public Status sendProducts() {

        return null;
    }
    
}
