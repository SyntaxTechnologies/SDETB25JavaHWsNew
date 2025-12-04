# String Method Practice: split()

## Objective
Learn how to use the `split()` method of the String class in Java to break a string into parts based on a delimiter.

## Instructions

1. **Create a String Variable**
   - Inside your `main` method, declare a String variable named `csvLine` and assign it the value:
     ```
     "John Doe,22,Computer Science,3.8,2025"
     ```

2. **Split the String**
   - Use the `split()` method with a comma (",") as the delimiter to split `csvLine` into an array of substrings.

3. **Print Each Field**
   - Use a normal for loop to iterate over the resulting array.
   - Print each element on a new line.

## Expected Output
```
John Doe
22
Computer Science
3.8
2025
```

## Tips
- Use the syntax: `csvLine.split(",")` to split the string.
- Use a for loop to traverse the resulting array.
- Remember that array indices start at 0.

## Troubleshooting
- Ensure the string is enclosed in double quotes.
- Verify that you are using a comma as the delimiter in split().

Happy coding!