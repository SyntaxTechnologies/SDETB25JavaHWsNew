package org.example.week9.d5.e2;

public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        double area = length * width;
        System.out.printf("Area of Rectangle is %.2f%n", area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 2 * (length + width);
        System.out.printf("Perimeter of Rectangle is %.2f%n", perimeter);
    }
}
