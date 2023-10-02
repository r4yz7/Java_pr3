package org.example;

public class FindNumber {
    public static <T extends Comparable<T>> T findMax(T a, T b, T c){
        T max = a;
        if(b.compareTo(max)>0){
            max = b;
        }
        if(c.compareTo(max)>0)
            max = c;
        return max;
    }

    public static <T extends  Comparable<T>>T findMin(T a, T b, T c, T d, T e){
        T min = a;
        if(b.compareTo(min)<0)
            min = b;
        if(c.compareTo(min)<0)
            min = c;
        if(d.compareTo(min)<0)
            min = d;
        if(d.compareTo(min)<0)
            min = d;
        if(e.compareTo(min)<0)
            min = e;
        return min;
    }

    public static <T extends Number> double calcAvg(T[] arr){
        double avg= 0;
        for(T i : arr){
            avg+=i.doubleValue();
        }
        return avg/arr.length;
    }

}
