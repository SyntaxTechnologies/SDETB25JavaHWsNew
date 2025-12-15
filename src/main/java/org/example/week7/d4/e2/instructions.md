# String Methods Practice: startsWith, contains, endsWith

## Objective
Learn how to use the `startsWith`, `contains`, and `endsWith` methods of the `String` class in Java to perform basic checks on a string.

## Instructions

**Processing an Email Address**

In this exercise, you will work with an email address and use string methods to verify certain parts of it.

**For you to do:**

1. **Declare and Assign a String Variable**
    - Declare a `String` variable named `email` and assign it the value `"john.doe@example.com"`.

2. **Use String Methods to Analyze the Email Address**
    - Use the `contains()` method to check if the email address contains the `"@"` symbol.
    - Use the `startsWith()` method to check if the email address starts with `"info"`.
    - Use the `endsWith()` method to check if the email address ends with `".com"`.

3. **Print the Results**
    - Print the boolean results of each check on separate lines (with no additional text).

## Expected Output

For the email address `"john.doe@example.com"`, your program should print:
```
true
false
true
```

## Tips
- Ensure your string variable is declared and assigned correctly.
- The methods return boolean values (`true` or `false`), so print these values directly.
- The methods are case-sensitive, so make sure your checks match the exact case of the email address.

## Troubleshooting
- **Compilation Errors:** Check for typos in method names and ensure that all strings are enclosed in double quotes.
- **Incorrect Results:** Verify that the substrings you are checking for (like `"@"`, `"info"`, and `".com"`) match exactly what is in the email address.

By following these steps, you should be able to complete the exercise and understand how to use these string methods in Java. Happy coding!