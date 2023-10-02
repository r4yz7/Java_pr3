package org.example;

public class Pilot extends Person {
    int experience;

    public Pilot(String fullName, String dateOfBirth, long numberOfPhone, String city, String country, String address, int experience) {
        super(fullName, dateOfBirth, numberOfPhone, city, country, address);
        this.experience = experience;
    }

    public void professionAndExperience(){
        System.out.println("I`m pilot, my work experience: " + experience);
    }
}
