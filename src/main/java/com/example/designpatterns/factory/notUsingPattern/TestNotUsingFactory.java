package com.example.designpatterns.factory.notUsingPattern;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestNotUsingFactory implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        String firstInstance = "dog";
        String secongInstance = "cat";

        System.out.println("TEST NOT USING FACTORY PATTERN");

        Animal firstAnimal = (firstInstance.equals("dog")) ?
                Dog.builder().type("dog").name("Dog1").build()
                : Cat.builder().type("cat").name("Cat1").build();

        Animal secongAnimal = (secongInstance.equals("dog")) ?
                Dog.builder().type("dog").name("Dog2").build()
                : Cat.builder().type("cat").name("Cat2").build();

        System.out.println(firstAnimal.apresentation());
        System.out.println(secongAnimal.apresentation());

        System.out.println("END TEST\n");

    }
}
