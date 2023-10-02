package org.example;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Random;

public class Array implements IShow{
    int[]arr = new int[5];
    public Array(){
        Random random = new Random();
        for (int i = 0;i<5;i++){
            this.arr[i] = random.nextInt(10);
        }
    }
    @Override
    public void Print() {
        for (int i = 0;i<5;i++){
           System.out.print(this.arr[i] +", ");
        }
        System.out.println();
    }

    @Override
    public void PrintInfo(String info) {
        System.out.println(info);
        Print();
    }
}
