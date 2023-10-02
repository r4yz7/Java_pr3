package org.example;

public class Saylor extends Person {
    int experience;

    public Saylor(String fullName, String dateOfBirth, long numberOfPhone, String city, String country, String address, int experience) {
        super(fullName, dateOfBirth, numberOfPhone, city, country, address);
        this.experience = experience;
    }

    public void professionAndExperience(){
        System.out.println("I`m saylor, my work experience: " + experience);
    }
}
