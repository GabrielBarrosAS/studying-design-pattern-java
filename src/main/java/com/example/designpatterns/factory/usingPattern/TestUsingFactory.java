package com.example.designpatterns.factory.usingPattern;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestUsingFactory implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        System.out.println("TEST USING FACTORY PATTERN");

        Animal firstAnimal = AnimalFactory.createAnimal("dog", "dog 1");
        Animal secondAnimal = AnimalFactory.createAnimal("cat", "cat 1");

        System.out.println(firstAnimal.apresentation());
        System.out.println(secondAnimal.apresentation());

        System.out.println("END TEST\n");
    }
}
