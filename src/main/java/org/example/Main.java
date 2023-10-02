package org.example;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
//        Person person = new Person("Maxim","23/09/2004",123123123,"Kriviy Rih","Ukraine","Chernyakhovskogo");
//        Person person1 = new Person("Alexey","13/08/2005",321321321,"Kriviy Rih","Ukraine","Ukrainskaya");
//        Person.showCountPeople();

//        double triangleArea1 = AreaCalc.calcTriangle(3,4,5);
//        double triangleArea2 = AreaCalc.calcTriangle2(5,3);
//        double rectangleArea = AreaCalc.calcRectangle(4,6);
//        double squareArea = AreaCalc.calcSquare(4);
//        double rhombusArea = AreaCalc.calcRhombus(8,6);
//        System.out.println("Area triangle 1: " + triangleArea1);
//        System.out.println("Area triangle 2: " + triangleArea2);
//        System.out.println("Area rectangle: " + rectangleArea);
//        System.out.println("Area square: " + squareArea);
//        System.out.println("Area rhombus: " + rhombusArea);

//        System.out.println("Maximum -> " + Count.maximum(4,1,8,3));
//        System.out.println("Minimum -> " + Count.minimum(4,1,8,3));
//        System.out.println("AVG -> "  + Count.AVG(4,1,8,3));
//        System.out.println("Factorial -> " + Count.factorial(4));

//        Builder builder = new Builder("Ivan","15/03/1992",123123123,"Kherson","Ukraine","qwe",8);
//        Pilot pilot = new Pilot("Maxim","12/09/1990",12312313,"Kyiv","Ukraine","sda",10);
//        Saylor saylor = new Saylor("Petro","08/08/1980",123123,"Odesa","Ukraine","sdd",15);
//        builder.professionAndExperience();
//        pilot.professionAndExperience();
//        saylor.professionAndExperience();

//        President president = new President("Maxim",44);
//        Security security = new Security("Alexey",28);
//        Manager manager = new Manager("Ivan",33);
//        Engineer engineer = new Engineer("Stepan",22);
//        president.print();
//        manager.print();
//        engineer.print();
//        security.print();

//        Show show = new Show();
//        show.Print();
//        show.PrintInfo("info");
//        Array array = new Array();
//        array.Print();
//        array.PrintInfo("info");

        System.out.println("Max: " + FindNumber.findMax(3,8,1));
        System.out.println("Min: " + FindNumber.findMin(3,8,1,2,10));
        Double[]arr = {1.0,2.0,3.0,4.0,5.0};
        System.out.println("AVG: " + FindNumber.calcAvg(arr));


    }
}