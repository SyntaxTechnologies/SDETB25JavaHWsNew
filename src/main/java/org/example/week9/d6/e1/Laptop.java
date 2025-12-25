package org.example.week9.d6.e1;

public class Laptop implements ElectronicDevice{

    @Override
    public void turnOn() {
        System.out.println("Laptop is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("Laptop is turning off");
    }

}
