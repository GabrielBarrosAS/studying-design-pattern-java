package com.example.designpatterns.observer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestUsingObserver implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {

        System.out.println("TEST USING OBSERVER PATTERN");
        Topic topic1 = Topic.builder().name("Topic 1").build();
        Topic topic2 = Topic.builder().name("Topic 2").build();

        Reader reader1 = Reader.builder().name("Reader 1").build();
        Reader reader2 = Reader.builder().name("Reader 2").build();

        //Chegar mensagem no tópico 1, somente o leitor 1 recebe
        topic1.addObserver(reader1);

        //Chegar mensagem no tópico 2, os dois recebem
        topic2.addObserver(reader1);
        topic2.addObserver(reader2);

        topic2.newMessage("Mensagem 1");
        topic1.newMessage("Mensagem 2");
        topic2.newMessage("Mensagem 3");
        topic2.newMessage("Mensagem 4");
        topic1.newMessage("Mensagem 5");

        System.out.println("END TEST\n");
    }
}
