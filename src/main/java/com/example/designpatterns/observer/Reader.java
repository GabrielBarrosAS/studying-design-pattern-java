package com.example.designpatterns.observer;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Reader implements Observer{

    private String name;

    @Override
    public void update(String message) {
        System.out.println(getName() + " recebeu a mensagem " + message);
    }
    
}
