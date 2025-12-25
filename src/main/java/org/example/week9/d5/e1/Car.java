package org.example.week9.d5.e1;

public class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started");
    }

    public void startEngine(String keyType) {
        System.out.println("Car engine started with " + keyType);
    }
}
