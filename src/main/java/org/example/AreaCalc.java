package org.example;

public class AreaCalc {
    static int numberOfCalc = 0;
    public static int showNumberOfCalc(){
        return numberOfCalc;
    }

    public static double calcTriangle(double a, double b, double c){
        double p = (a+b+c)/2;//6
        numberOfCalc++;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public static double calcTriangle2(double a, double h){
        numberOfCalc++;

        return 0.5*a*h;
    }



    public static double calcRectangle(double a,double b){
        numberOfCalc++;

        return a*b;
    }

    public static double calcSquare(double a){
        numberOfCalc++;

        return a*a;
    }

    public static double calcRhombus(double d1,double d2){
        numberOfCalc++;
        return (d1*d2)/2;
    }
}
