package org.example;

public abstract class Worker {
    String name;
    int age;

    public Worker(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void print();

}
