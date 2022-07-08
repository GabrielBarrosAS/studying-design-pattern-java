package com.example.designpatterns.observer;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Topic extends Observable {
    private String name;
    private String message;

    public void newMessage(String message) {
        this.setMessage(getName() + ": " + message);
        notifyObservers(getMessage());
    }
}
