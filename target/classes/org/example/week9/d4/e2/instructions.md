# Understanding Polymorphism in Java

## Objective
Learn how to implement polymorphism in Java by creating a simple class hierarchy that demonstrates method overriding. In this exercise, you will create a base class and two subclasses that override a method, then use polymorphism to call the overridden methods.

## Instructions

**Step 1: Create the `Shape` Class**

1. Inside the `Shape` class, define a public method called `calculateArea()` that returns a `double`.
    - For simplicity, you can have this method return 0 or a default value.
    - Example:
      ```
      public double calculateArea() {
          return 0;
      }
      ```

**Step 2: Create the `Circle` Class that Extends `Shape`**

1.  Make `Circle` extend `Shape`.
2. In the `Circle` class, add a field for the radius (of type `double`) and a constructor that sets the radius.
3. Override the `calculateArea()` method to return the area of the circle using the formula:
   ```
   area = Math.PI * radius * radius
   ```

**Step 3: Create the `Rectangle` Class that Extends `Shape`**

1. Make `Rectangle`  extends `Shape`.
2. In the `Rectangle` class, add fields for the width and height (of type `double`) and a constructor that sets these values.
3. Override the `calculateArea()` method to return the area of the rectangle using the formula:
   ```
   area = width * height
   ```

**Step 4: Test Polymorphism**

1. In the existing main class (e.g., `E2Polymorphism.java`), inside the `main` method:
    - Create an array of `Shape` objects that contains at least one `Circle` and one `Rectangle`.
    - For example, create a `Circle` object with a radius of 5 and a `Rectangle` object with a width of 4 and a height of 6.
    - Iterate through the array using a normal for loop and for each shape, call its `calculateArea()` method and print the returned area.
2. Run your program to verify that the correct areas for the circle and rectangle are printed.

## Expected Output
Assuming a Circle with radius 5 and a Rectangle with width 4 and height 6, the output should be similar to:
```
78.54
24.00
```
*(Note: The areas are approximate and formatted to two decimal places.)*

## Tips
- **Method Overriding:**  
  In each subclass (Circle and Rectangle), override the `calculateArea()` method to compute the area specific to that shape.
- **Polymorphism:**  
  Store objects of different subclasses in an array of the base class type (`Shape[]`) and call the overridden methods without needing to know the specific subclass.
- **Testing:**  
  Use a simple for loop in your main method to iterate over the `Shape` array and print the results of `calculateArea()`.

## Troubleshooting
- Ensure that your classes are correctly set up so that `Circle` and `Rectangle` extend `Shape`.
- Verify that the overridden methods in the subclasses return the correct values.
- Check that you are instantiating the subclasses properly in your main method.

Happy coding!