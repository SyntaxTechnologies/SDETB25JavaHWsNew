# Using Type Casting in Java with Objects

## Objective
Learn how to use type casting to convert an object of a parent class to a child class in order to call child-specific methods.

## Instructions

1. **Create the Animal Class**
   - In the existing `Animal.java` file, create a class named `Animal`.
   - Inside the `Animal` class, define a public method called `makeSound()` that prints:
     ```
     Animal sound.
     ```

2. **Create the Dog Class that Extends Animal**
   - In the existing `Dog.java` file, create a class named `Dog` that extends `Animal`.
   - Override the `makeSound()` method so that it prints:
     ```
     Woof!
     ```
   - Add a new public method in the `Dog` class named `fetch()` that prints:
     ```
     Fetching the ball!
     ```

3. **Test Type Casting in the Main Method**
   - In the existing main class (e.g., `E1TypeCasting.java`), within the `main` method:
      - Create an object of the `Dog` class, but assign it to a variable of type `Animal`.
      - Call the `makeSound()` method on the `Animal` variable (this should print "Woof!").
      - Cast the `Animal` reference to a `Dog` reference.
      - Call the `fetch()` method on the casted object to print the dog-specific message.

## Expected Output
```
Woof!
Fetching the ball!
```

## Tips
- **Polymorphism:**  
  A child object (Dog) can be stored in a parent class variable (Animal).
- **Type Casting:**  
  To access methods specific to the Dog class, cast the Animal reference to a Dog reference.
- **Method Calls:**  
  First, call `makeSound()` using the Animal variable. Then, cast the object and call `fetch()`.

## Troubleshooting
- If you get a ClassCastException, ensure that the object you're casting is actually a Dog.
- Verify that you correctly override the `makeSound()` method in the Dog class.
- Ensure the type cast is performed before calling the child-specific method.

Happy coding!