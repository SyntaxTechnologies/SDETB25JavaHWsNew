package org.example.week8.d6.e1;

public class Car extends Vehicle{

    String model;

    public void displayCarInfo() {
        displayInfo();
        System.out.println("Model: " + model);
    }
}
