package org.example;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    String eyeColor;
    int height;
    double weight;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, String eyeColor, int height, double weight) {
        this(firstName, lastName, age);
        this.eyeColor = eyeColor;
        this.height = height;
        this.weight = weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen(){
        return age <= 19 && age >= 13;
    }
}
