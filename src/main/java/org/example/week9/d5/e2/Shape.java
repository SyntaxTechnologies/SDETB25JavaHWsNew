package org.example.week9.d5.e2;

public abstract class Shape {

    protected String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public abstract void calculateArea();

    public abstract void calculatePerimeter();

    public void displayName() {
        System.out.println("The name of the shape is: " + shapeName);
    }
}

