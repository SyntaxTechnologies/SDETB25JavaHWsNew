# Declaring Variables with Private, Default, and Public Access Modifiers and Displaying Details

## Objective
Learn how to declare variables with different access modifiers in Java and display their values using a method. You will work within the existing class named `AccessTester`.

## Instructions

1. **Declare Variables with Access Modifiers in `AccessTester`**  
   Inside the `AccessTester` class (but outside any methods), declare the following instance variables:
    - A **private** variable for `name` (type `String`)
    - A **default** (package-private) variable for `city` (type `String`)
    - A **public** variable for `batchNumber` (type `int`)

2. **Create a Method to Display Details**  
   In the `AccessTester` class, create a method named `display` that prints a message using the declared variables.  
   The message should be in the following format (using a literal for the school name):
   ```
   My name is John and I live in Miami. I study at Syntax in batch 9.
   ```

3. **Assign Values in the `main` Method**  
   Inside the existing `main` method of `E2AccessModifiers`:
    - Create an instance of `AccessTester`.
    - Using that instance, assign the following values:
      ```java
      accessTester.name = "John";
      accessTester.city = "Miami";
      accessTester.batchNumber = 9;
      ```
    - Call the `display` method on the instance to print the details.

## Expected Output
```
My name is John and I live in Miami. I study at Syntax in batch 9.
```

## Tips
- **Variable Declaration:**  
  Declare the variables at the class level (outside any methods) so they are accessible throughout the class.
- **Access Modifiers:**  
  Use `private`, default (no modifier), and `public` to understand their scope.
- **Accessing Variables:**  
  Use the dot notation (e.g., `accessTester.name`) to assign and access values.
- **Printing Details:**  
  In the `display` method, combine the variable values into a single string using concatenation, and print it with `System.out.println`.

## Troubleshooting
- Ensure that the variables are declared inside the `AccessTester` class and not inside any method.
- Make sure you create an object of the `AccessTester` class in the `main` method before assigning values.
- Check that you use the correct access modifiers and data types.
- Verify that the `display` method correctly constructs and prints the message.

Happy coding!