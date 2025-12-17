# Creating a Method to Check if a Number is Even

## Objective
Learn how to create a method in Java that checks if a single number is even and returns a boolean value.

## Instructions

1. **Create the NumberChecker Class**
   - Use the provided Java file that contains the `NumberChecker` class.

2. **Create the isEven Method**
   - Inside the `NumberChecker` class, create a method named `isEven`.
   - The method should accept one integer parameter (e.g., `int num`).
   - Inside the method, check if the number is even using the modulus operator (`%`).
      - Return `true` if `num % 2 == 0`; otherwise, return `false`.

3. **Call the isEven Method from main**
   - In the `main` method of the `NumberChecker` class, call the `isEven` method with different numbers to test it.
   - Print the result of each call using `System.out.println`.

4. **Run the Program**
   - Compile and run your program.
   - For example, calling `isEven(4)` should print `true` and calling `isEven(7)` should print `false`.

## Expected Output
For example:
```
true
false
```

## Tips
- Use the modulus operator (`%`) to check if a number is divisible by 2.
- Make sure your method returns a boolean value.
- Test your method with multiple numbers to ensure it works correctly.

## Troubleshooting
- If your program doesn't compile, check for syntax errors such as missing semicolons or incorrect method declarations.
- Verify that your logic in the `isEven` method is correct by testing with both even and odd numbers.

Happy coding!