package com.example.designpatterns.factory.usingPattern;

public class AnimalFactory {

    public static Animal createAnimal(String type, String name) {

        return (type.equals("dog")) ? Dog.builder().name(name).build() : Cat.builder().name(name).build();

    }
}
