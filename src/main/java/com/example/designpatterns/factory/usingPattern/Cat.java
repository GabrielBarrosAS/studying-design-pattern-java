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
public class Cat implements Animal {

    private String name;

    @Override
    public String apresentation() {

        return "I am one cat. My name is " + this.getName();

    }

}
