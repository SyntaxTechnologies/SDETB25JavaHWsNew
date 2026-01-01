package org.example.week9.d5.e1;

public abstract class Vehicle {
    // Declare an abstract method startEngine() with no parameters.
    // Create a non-abstract method stopEngine() that prints "Vehicle engine stopped".

    public abstract void startEngine();

    public void stopEngine() {
        System.out.println("Vehicle engine stopped");
    }

}
