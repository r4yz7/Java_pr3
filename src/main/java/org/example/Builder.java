package org.example;

public class Builder extends Person {
    int experience;

    public Builder(String fullName, String dateOfBirth, long numberOfPhone, String city, String country, String address, int experience) {
        super(fullName, dateOfBirth, numberOfPhone, city, country, address);
        this.experience = experience;
    }

    public void professionAndExperience(){
        System.out.println("I`m builder, my work experience: " + experience);
    }
}
