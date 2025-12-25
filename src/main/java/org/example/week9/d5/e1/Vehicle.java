package org.example.week9.d5.e1;

public abstract class Vehicle {
    public abstract void startEngine();

    // Create a non-abstract method stopEngine() that prints "Vehicle engine stopped".
    public void stopEngine() {
        System.out.println("Vehicle engine stopped");
    }
}
