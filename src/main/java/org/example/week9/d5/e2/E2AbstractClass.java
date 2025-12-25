package org.example.week9.d5.e2;

import java.awt.*;

public class E2AbstractClass {
    public static void main(String[] args){
        Shape rectangle = new Rectangle(6, 4);
        rectangle.displayName();
        rectangle.calculateArea();
        rectangle.calculatePerimeter();

        Shape circle = new Circle(5);
        circle.displayName();
        circle.calculateArea();
        circle.calculatePerimeter();
    }
}


