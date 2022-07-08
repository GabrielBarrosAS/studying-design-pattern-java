package com.example.designpatterns.factory.usingPattern;

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
public class Dog implements Animal {

    private String name;

    public String apresentation() {

        return "I am one dog. My name is " + this.getName();

    }
}
