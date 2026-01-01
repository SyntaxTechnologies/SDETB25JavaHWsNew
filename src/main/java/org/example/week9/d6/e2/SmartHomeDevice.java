package org.example.week9.d6.e2;

public class SmartHomeDevice implements Controllable, Configurable {

    @Override
    public void turnOn() {
        System.out.println("Turning on Smart Home Device");
    }

    @Override
    public void configure() {
        System.out.println("Configuring Smart Home Device settings");
    }
}