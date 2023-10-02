package org.example;

public class Engineer extends Worker{
    public Engineer(String name, int age) {
        super(name, age);
    }

    @Override
    public void print() {
        System.out.println("My name`s " + name + "I`m " + age + "years old. I`m engineer" );
    }
}
