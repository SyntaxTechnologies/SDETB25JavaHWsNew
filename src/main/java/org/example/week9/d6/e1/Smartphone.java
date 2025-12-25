package org.example.week9.d6.e1;

public class Smartphone implements ElectronicDevice{
    @Override
    public void turnOn() {
        System.out.println("Smartphone is turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("Smartphone is turning off");
    }
}
