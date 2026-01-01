package org.example.week9.d5.e1;

public class E1AbstractClass {
    public static void main(String[] args){



        // Create an object of the Car class.
        // Call both the startEngine() and startEngine(String) methods.
        // Call the stopEngine() method inherited from the Vehicle class.
        // Print the output to verify that all methods are being called correctly

        Car car = new Car();

        car.startEngine();
        car.startEngine("a smart key");
        car.stopEngine();
    }
}


