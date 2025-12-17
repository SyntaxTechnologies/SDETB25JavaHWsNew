# Implementing Multi-Level Inheritance in Java

## Objective
Learn how to implement multi-level inheritance in Java by creating a simple three-level class hierarchy. You will create a superclass, a subclass, and a sub-subclass, each with its own method that prints a message. 

## Instructions

**Step 1: Create the `Animal` Class**

1. In the `Animal.java` file, create a class named `Animal`.
2. Inside the `Animal` class, define a public method called `displayAnimalInfo()` that prints:
   ```
   I am an animal.
   ```

**Step 2: Create the `Mammal` Class that Extends the `Animal` Class**

1. In the `Mammal.java` file, create a class named `Mammal` that extends `Animal`.
2. Inside the `Mammal` class, define a public method called `displayMammalInfo()` that prints:
   ```
   I am a mammal.
   ```

**Step 3: Create the `Dog` Class that Extends the `Mammal` Class**

1. In the `Dog.java` file, create a class named `Dog` that extends `Mammal`.
2. Inside the `Dog` class, define a public method called `displayDogInfo()` that prints:
   ```
   I am a dog.
   ```

**Step 4: Test Your Multi-Level Inheritance**

1. In the existing main class (e.g., `E2Inheritance.java`), inside the `main` method:
   - Create an instance of the `Dog` class.
   - Call each of the following methods on that object:
      - `displayAnimalInfo()`
      - `displayMammalInfo()`
      - `displayDogInfo()`
2. Run your program to verify that the output matches the expected results.

## Expected Output
```
I am an animal.
I am a mammal.
I am a dog.
```

## Tips
- Each class should have its own method that prints its specific message.
- Ensure the class hierarchy is correct: `Mammal` should extend `Animal` and `Dog` should extend `Mammal`.

## Troubleshooting
- Verify that your classes are set up with the correct inheritance.
- Check that each method is declared as public and has a void return type.
- Make sure you create an instance of `Dog` in your main method and call all three methods on that object.

Happy coding!