# Creating Static and Non-Static Methods

## Objective
Learn how to create and execute both static and non-static methods in Java. In this exercise, you will add two methods to the existing `MessagePrinter` class.

## Instructions

1. **Create Two Methods in the MessagePrinter Class**
   - **Non-Static Method:**  
     Create a method called `nonStaticMethod` that prints:
     ```
     Programming is amazing.
     ```
   - **Static Method:**  
     Create a method called `staticMethod` that prints:
     ```
     Java is awesome.
     ```

2. **Execute Both Methods from the main Method**
   - In the existing `main` method, create an instance of `MessagePrinter` and call `nonStaticMethod` on it.
   - Call `staticMethod` using the class name `MessagePrinter`.

## Expected Output
```
Programming is amazing.
Java is awesome.
```

## Tips
- **Non-Static Method:**  
  Remember to call this method on an object of `MessagePrinter`.
- **Static Method:**  
  Call this method directly using the class name, like `MessagePrinter.staticMethod()`.

## Troubleshooting
- Ensure that both methods are defined inside the `MessagePrinter` class.
- Check that your `main` method correctly creates an instance and calls the methods.
- Verify there are no syntax errors such as missing semicolons or incorrect method signatures.

Happy coding!