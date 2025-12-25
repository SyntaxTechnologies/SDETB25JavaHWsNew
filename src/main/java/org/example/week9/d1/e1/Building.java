package org.example.week9.d1.e1;

public class Building {

    String location;

    public Building(String location) {
        this.location = location;
        System.out.println(location);
    }

    public Building() {
        System.out.println("Building Constructor");
    }
}
