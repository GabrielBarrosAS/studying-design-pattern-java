package com.example.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Observable {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void addRemove(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers(String message) {

        observers.stream().forEach(observer -> {
            observer.update(message);
        });

    }
}
