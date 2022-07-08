package com.example.designpatterns.factory.notUsingPattern;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Dog extends Animal {

    private String name;
    private String type;

    public String apresentation() {

        return "I am one " + this.getType() + ". My name is " + this.getName();

    }
}
