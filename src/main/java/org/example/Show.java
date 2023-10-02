package org.example;

public class Show implements IShow {

    @Override
    public void Print() {
        System.out.println("print");
    }

    @Override
    public void PrintInfo(String info) {
        System.out.println("print " + info);

    }
}
