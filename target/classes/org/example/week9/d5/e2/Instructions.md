# Implementing Abstract and Non-Abstract Methods in a Shape Management System

## Objective
Learn how to use abstract classes and methods in Java, override and implement abstract methods, and call both abstract and implemented methods from the parent class in the child class. In this exercise, you'll manage different types of vehicles, demonstrating inheritance and abstraction.

## Instructions

**Step 1: Create the `Shape` Abstract Class**

1. **Create the `Shape.java` Abstract class** with the following:
   - Create a protected String variable with name as `shapeName`
   - Create a constructor of Shape class with `shapeName` parameter
   - Sample code:
     `public Shape(String shapeName) {
        this.shapeName = shapeName;
    }`
   - **Abstract Methods:**
      - Declare an abstract method `calculateArea()` with no parameters.
      - Declare an abstract method `calculatePerimeter()` with no parameters.
   - **Implemented Method:**
      - Create a non-abstract method `displayName()` that prints "The name of the shape is: [shapeName]".

**Step 2: Create the `Rectangle and Circle` Classes**

1. **Create the `Rectangle.java` class** as a subclass of `Shape`:
      - Has private instance variables `width` and `height` both double.
      - Create a constructor of Rectangle class which `width` and `height` of type double as parameters.
      - Inside constructor,Use super keyword to call the constructor of Shape class(parent class) and pass `Rectangle` as Parameter and use this keyword to assign values to private instance variables length and width.
      - Sample code:
        `public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }`
      - **Override the `calculateArea()` Method:**
         - Provide the implementation for the `calculateArea()` method and implement the logic to display area of the rectangle using the formula Area=length*breath.
         - Example - `Area of Rectangle is 24.00`.
      - **Override the `calculatePerimeter()` Method:**
         - Provide the implementation for the `calculatePerimeter()` method and implement the logic to display area of the rectangle using the formula Perimeter=2*(length+breath).
         - Example - `Perimeter of Rectangle is 20.00`.
         - 
2. **Create the `Circle.java` class** as a subclass of `Shape`:
    - Has private instance variable `radius` of type double.
    - Has private final variable PI as `private final double PI = Math.PI;`.
    - Create a constructor of Circle class which `radius` of type double as parameter.
        - Inside constructor,Use super keyword to call the constructor of Shape class(parent class) and pass `Circle` as Parameter and use this keyword to assign values to private instance variable radius.
        - Sample code:
      `public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }`
    - **Override the `calculateArea()` Method:**
        - Provide the implementation for the `calculateArea()` method and implement the logic to display area of the circle using the formula Area=PI*radius*radius.
        - Example - `Area of Circle is 78.54`.
    - **Override the `calculatePerimeter()` Method:**
        - Provide the implementation for the `calculatePerimeter()` method and implement the logic to display area of the rectangle using the formula Perimeter=2*PI*radius.
        - Example - `Perimeter of Circle is 31.41`.

3. **In the `E2AbstractClass.java` class** :
      - **Main Method (In `E2AbstractClass`):**
          - Create an object of the `Shape` class using Rectangle class constructor.
            - Example : `Shape rectangle = new Rectangle(6, 4);`
            - Call  the `displayName()`,`calculateArea()` and `calculatePerimeter()` methods.
          - Create an object of the `Shape` class using Circle class constructor.
            - Example : `Shape circle = new Circle(5);`
            - Call  the `displayName()`,`calculateArea()` and `calculatePerimeter()` methods.



## Example Output:

**Expected Output:**

```plaintext
The name of the shape is: Rectangle
Area of Rectangle is 24.00
Perimeter of Rectangle is 20.00
The name of the shape is: Circle
Area of Circle is 78.54
Perimeter of Circle is 31.42
```

**Explanation:**
- The `calculateArea`,`calculatePerimeter()`  methods are abstract in the parent class `Shape` and must be implemented in the `Rectangle` and `Circle` classes.
- The `displayName()` method is implemented in the `Shape` class and inherited by the `Rectangle` and `Circle`class, where it can be called without overriding.

**Step 3: Run Your Application**

1. Execute your program to verify that the output matches the expected result.

## Tips:

- **Abstract Methods:** Abstract methods must be implemented in any subclass that extends the abstract class.
- **Method Overloading and Overriding:** Method overloading allows you to define multiple methods with the same name but different parameters. Overriding is used when the child class provides its own implementation for a method from the parent class.

By completing this exercise, you will gain a clear understanding of how to work with abstract classes, method overriding, and method overloading in a real-life vehicle management system. Happy coding!
