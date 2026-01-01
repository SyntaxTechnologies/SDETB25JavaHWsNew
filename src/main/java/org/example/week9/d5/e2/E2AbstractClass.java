package org.example.week9.d5.e2;

import java.awt.*;

public class E2AbstractClass {
    public static void main(String[] args) {

        // Step 1: Create a `Shape` class with the following:
        // Create a protected String variable with name as shapeName and Create a constructor of Shape class with shapeName parameter
        // Declare two abstract methods calculateArea(),calculatePerimeter() with no parameters.
        // Create a non-abstract method displayName() that prints "The name of the shape is: [shapeName]".
        // Step 2: Create the Rectangle.java class as a subclass of Shape:
        // Create private instance variables width and height both double.
        // Create a constructor of Rectangle class which width and height of type double as parameters.
        // Inside constructor,Use super keyword to call the constructor of Shape class(parent class) and pass Rectangle as Parameter and use this keyword to assign values to private instance variables length and width.
        // Override the calculateArea() Method:
        // Provide the implementation for the calculateArea() method and implements the logic to display area of the rectangle using the formula Area=length*breath.
        // Override the calculatePerimeter() Method:
        // Provide the implementation for the calculatePerimeter() method and implements the logic to display area of the rectangle using the formula Perimeter=2*(length+breath).
        // Step 3: Create the Circle.java class as a subclass of Shape:
        // Has private instance variable radius of type double.
        // Has private final variable PI as private final double PI = Math.PI;.
        // Create a constructor of Circle class with radius of type double as parameter.
        // Inside constructor,Use super keyword to call the constructor of Shape class(parent class) and pass Circle as Parameter and use this keyword to assign values to private instance variable radius.
        // Override the calculateArea() Method:
        // Provide the implementation for the `calculateArea()` method and implements the logic to display area of the circle using the formula Area=PI*radius*radius.
        // Override the `calculatePerimeter()` Method:**
        // Provide the implementation for the `calculatePerimeter()` method and implements the logic to display area of the rectangle using the formula Perimeter=2*PI*radi
        // Step 3: In the E2AbstractClass, class,Main class,create an object of the Shape class.
        // Create an object of the `Shape` class using Rectangle class constructor.
        // Call the `displayName()`,`calculateArea()` and `calculatePerimeter()` methods.
        // Create an object of the `Shape` class using Circle class constructor.
        // Call the `displayName()`,`calculateArea()` and `calculatePerimeter()` methods.
        // Print the output to verify that all methods are being called correctly

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



