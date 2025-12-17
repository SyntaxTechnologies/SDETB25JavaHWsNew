# Understanding Constructors and Inheritance

## Objective
Learn how to work with constructors in Java and understand how inheritance affects constructor calls. In this exercise, you will update the existing `Building` and `House` classes by adding fields and constructors. You will also learn about calling a parent's constructor from a subclass.

## Instructions

**Step 1: Update the `Building` Class**

1. In the existing `Building.java` class:
   - Declare an instance variable of type `String` named `location`.
   - Create a **parameterized constructor** that takes a `String` parameter (e.g., `location`) and prints the location. For example, if the constructor is called with `"Vienna"`, it should print:
     ```
     Vienna
     ```
   - Create a **default constructor** that prints a message such as:
     ```
     Building Constructor
     ```

**Step 2: Update the `House` Class**

1. In the existing `House.java` class (which extends `Building`):
   - Add a constructor that takes a `String` parameter for the location.
   - Inside this constructor, call the parent class’s parameterized constructor using the `super` keyword (e.g., `super(location);`).

   **Note:** If your parent class (`Building`) has a parameterized constructor and no default constructor, you must call `super()` with a matching parameter in the subclass to avoid a compile-time error.

**Step 3: Test Your Application**

1. In the existing main class (e.g., `E1SuperKeyword.java`), inside the `main` method:
   - Create an instance of the `House` class, passing a location string such as `"Vienna"` to its constructor.
2. Run your program to verify that the output matches the expected results.

## Expected Output
```
Vienna
```

## Tips
- **Constructor Chaining:**  
  In the `House` class, remember to call the parent constructor using `super(location);` so that the parent's constructor logic executes.
- **Matching Constructors:**  
  If your parent class only has a parameterized constructor, ensure your subclass constructor calls it; otherwise, you may encounter a compile-time error.
- **Testing:**  
  Create a `House` object in your main method and pass a location (e.g., `"Vienna"`) to check that the correct message is printed.

## Troubleshooting
- If you encounter errors related to constructors, verify that the subclass constructor is correctly calling the parent class constructor with the proper arguments.
- Check that your print statements in the constructors output the expected messages.

Happy coding!