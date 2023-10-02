package org.example;

public class Security extends Worker{
    public Security(String name, int age) {
        super(name, age);
    }

    @Override
    public void print() {
        System.out.println("My name`s " + name + "I`m " + age + "years old. I`m security" );

    }
}
