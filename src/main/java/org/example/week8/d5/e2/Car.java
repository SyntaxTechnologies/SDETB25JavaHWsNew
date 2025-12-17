package org.example.week8.d5.e2;

public class Car {
    String make;
    String model;
    int numberOfDoors;
    int topSpeed;
    double price;


    public Car(String make, String model, int numberOfDoors, int topSpeed, double price) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }


    public Car(String make, String model, int topSpeed, double price) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = 4;
        this.topSpeed = topSpeed;
        this.price = price;
    }


    public Car(int numberOfDoors, int topSpeed, double price) {
        this.make = "unknown";
        this.model = "unknown";
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }


    public Car(String make, String model, int numberOfDoors) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = 90;
        this.price = 0.0;
    }

    public void display() {
        System.out.println(make + " " + model + " " + numberOfDoors + " " + topSpeed + " " + price);
    }
}
