package org.example;

public class Count {
    public static int maximum(int a, int b, int c, int d){
        int max = a;
        if(max<b)
            max = b;
        if(max<c)
            max = c;
        if(max < d)
            max =d ;
        return max;
    }
    public static int minimum(int a, int b, int c, int d){
        int min = a;
        if(min>b)
            min = b;
        if(min>c)
            min = c;
        if(min > d)
            min =d ;
        return min;
    }

    public static double AVG(double a,double b,double c, double d){
        return (a+b+c+d)/4;
    }
    public static int factorial(int a){
        if(a<1)
            return 0;
        else{
            int fact =1;
            for (int i = a; i>=2; i--){
                fact*=i;
            }
            return fact;
        }
    }
}
