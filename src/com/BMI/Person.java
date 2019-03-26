package com.BMI;

public class Person
{
    private double weight;
    private double height;
    private int age;

    public Person(double weight, double height, int age) {
        this.weight = weight;
        this.height = height;
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }
}
