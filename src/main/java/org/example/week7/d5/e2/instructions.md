# String Method Practice: replace()

## Objective
Learn how to use the `replace()` method of the String class in Java to modify a string by replacing one substring with another.

## Instructions

1. **Create a String Variable**
   - Inside the existing `main` method, declare a String variable named `textMessage` and assign it the value:
     ```
     "Hey! LMK if you are free."
     ```

2. **Replace the Substring**
   - Use the `replace()` method to replace `"LMK"` with `"Let me know"`.

3. **Print the Modified String**
   - Print the result using `System.out.println`.

## Expected Output
```
Hey! Let me know if you are free.
```

## Tips
- Use the syntax: `textMessage.replace("LMK", "Let me know")`
- Remember, strings in Java are immutable, so the `replace()` method returns a new string.
- Print the returned value to see the modified string.

## Troubleshooting
- Ensure both the target and replacement substrings are enclosed in double quotes.
- Verify that you assign the result of the `replace()` method to a variable (or print it directly) to see the change.

Happy coding!