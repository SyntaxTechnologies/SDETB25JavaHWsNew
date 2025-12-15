# Implementing Method Overriding in Java

## Objective
Learn how to override a method in a subclass by creating a base class with a method and a subclass that provides its own implementation of that method.

## Instructions

**Step 1: Create the `Animal` Class**

1. Inside the `Animal` class, define a public method called `makeSound()` that prints:
   ```
   Animal sound.
   ```

**Step 2: Create the `Dog` Class that Extends the `Animal` Class**

1. In the existing `Dog.java` file, create a class named `Dog` that extends `Animal`.
2. In the `Dog` class, override the `makeSound()` method so that it prints:
   ```
   Bark.
   ```
3. Ensure that the method signature in `Dog` exactly matches that in `Animal`.

**Step 3: Test Method Overriding**

1. In the existing main class (e.g., `E1MethodOverriding.java`), inside the `main` method:
    - Create an instance of the `Dog` class.
    - Call the `makeSound()` method on this instance.
2. Run your program to verify that the overridden method in `Dog` is executed.

## Expected Output
```
Bark.
```

## Tips
- **Method Overriding:**  
  The subclass (`Dog`) should provide its own implementation of the method that exists in the superclass (`Animal`).
- **Annotation:**  
  Optionally, use the `@Override` annotation above the overridden method in `Dog` to indicate that you are overriding a method.
- **Testing:**  
  In your main method, create an object of `Dog` and call `makeSound()` to check that "Bark." is printed.

## Troubleshooting
- Make sure the method signature in `Dog` exactly matches that in `Animal` (same name, parameter list, and return type).
- If the wrong message is printed, verify that the object is indeed of type `Dog` and that you have correctly overridden the method.
- Ensure that you use `System.out.println` to print the message so that the output appears on the console.

Happy coding!