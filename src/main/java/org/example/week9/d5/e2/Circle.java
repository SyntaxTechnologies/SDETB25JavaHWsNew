package org.example.week9.d5.e2;

public class Circle extends Shape{
    private double radius;
    private final double PI = Math.PI;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        double area = PI * radius * radius;
        System.out.printf("Area of Circle is %.2f%n", area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 2 * PI * radius;
        System.out.printf("Perimeter of Circle is %.2f%n", perimeter);
    }
}
