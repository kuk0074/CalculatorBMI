package com.BMI;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            personData();
        } catch (InputMismatchException e) {
            System.err.println("Wrong input. Try again.");
        }

    }

    public static void resultSections(double resultBMI) {
        if (resultBMI < 16) {
            System.out.println("Starvation");
        } else if (resultBMI < 17) {
            System.out.println("Emaciation");
        } else if (resultBMI < 18.5) {
            System.out.println("Underweight");
        } else if (resultBMI < 25) {
            System.out.println("Correct weight");
        } else if (resultBMI < 30) {
            System.out.println("Overweight");
        } else if (resultBMI < 35) {
            System.out.println("Obesity");
        } else if (resultBMI < 40) {
            System.out.println("II degree of obesity");
        } else {
            System.out.println("III degree of obesity");
        }
    }

    public static void personData() {
        double weight = -1;
        double height = -1;
        int age = -1;
        double result;

        System.out.println("Enter your age: ");
        do {
            if (!sc.hasNextInt()){
                System.out.println("Please enter valid value.");
            } else {
                age = sc.nextInt();
                if (age <18){
                    System.out.println("Your age must be higher than 18.");
                }
            }
            sc.nextLine();
        } while (age < 18);

        System.out.println("Enter your weight [kg]: ");
        do {
            if (!sc.hasNextDouble()) {
                System.out.println("Please enter valid value.");
            } else {
                weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println(weight + " is not valid option.\n Enter your weight again: ");
                }
            }
            sc.nextLine();
        } while (weight <= 0);

        System.out.println("Enter your height [m]: ");
        do {
            if (!sc.hasNextDouble()) {
                System.out.println("Please enter valid value.");
            } else {
                height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println(height + " is not valid option.\n Enter your height again: ");
                }
            }
            sc.nextLine();
        } while (height <= 0);


        Person person = new Person(weight, height, age);

        System.out.println("Calculating BMI coefficient: ");
        result = person.getWeight() / Math.pow(person.getHeight(), 2);

        System.out.println("Your BMI coefficient is equal to: " + result);
        System.out.println("The result of this test is: ");

        resultSections(result);

    }

}
