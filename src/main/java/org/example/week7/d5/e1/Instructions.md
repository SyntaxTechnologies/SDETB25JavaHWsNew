# String Method Practice: substring()

## Objective
Learn how to use the `substring()` method of the `String` class in Java to extract a portion of a string.

## Instructions

1. **Create a String Variable**
   - Inside the `main` method, declare a `String` variable named `dataString` and assign it the value `"HelloLearnJavaWorld"`.

2. **Extract a Portion Using substring()**
   - Use the `substring()` method to extract the part `"LearnJava"` from `dataString`.
   - You should use the method with two parameters: the starting index and the ending index (the character at the ending index is not included).

3. **Print the Extracted Substring**
   - Use `System.out.println` to print the extracted substring.

## Expected Output
```
LearnJava
```

## Tips
- In the string `"HelloLearnJavaWorld"`, count the characters starting from 0 to determine the correct indices for `"LearnJava"`.
- Ensure that you use the correct indices so that the extracted part is exactly `"LearnJava"`.

## Troubleshooting
- If the output is not as expected, double-check your start and end indices.
- Make sure you call the `substring()` method correctly.
- Verify that the string is exactly as given and that no extra spaces or characters are present.

By following these steps, you'll learn how to extract a specific portion of a string using the `substring()` method. Happy coding!