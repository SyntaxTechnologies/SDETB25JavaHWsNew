# Using the isEmpty() and trim() Methods in Java Strings

## Objective
Learn how to use the isEmpty() and trim() methods of the String class in Java. You will check if strings are empty and remove leading and trailing spaces from a string.

## Instructions

**Check if Strings are Empty Using the isEmpty() Method**

For this part:

1. **Create String Variables**
   - Create a `String` variable named `s1` and assign it the value `"Hello"`.
   - Create a `String` variable named `s2` and assign it an empty string `""`.
   - Create a `String` variable named `s3` and assign it the value "   " (a string with three spaces).

2. **Check if the Strings are Empty**
   - Use the `isEmpty()` method to check if `s1`, `s2`, and `s3` are empty.
   - Print the results in the following format:
      - `Is s1 empty? [result]`
      - `Is s2 empty? [result]`
      - `Is s3 empty? [result]`

**Remove Spaces Using the trim() Method**

For this part:

1. **Create a String Variable**
   - Create a `String` variable named `text` and assign it the value `"   LearnJava   "` (note the extra spaces before and after the text).

2. **Trim the String**
   - Use the `trim()` method to remove the leading and trailing spaces from `text`.

3. **Print the Trimmed String**
   - Print the result of the trim operation.

## Expected Output
```
Is s1 empty? false
Is s2 empty? true
Is s3 empty? false
LearnJava
```

## Tips
- Ensure your string variables are declared and assigned correctly.
- Remember that the `isEmpty()` method returns `true` only if the string's length is 0.
- A string containing whitespace characters (like spaces) is **not** considered empty.
- Use `trim()` to remove the extra spaces at the beginning and end of a string.
- Use the correct syntax for calling these methods: `string.isEmpty()` and `string.trim()`.

## Troubleshooting
- If your program doesn't compile, check for syntax errors such as missing semicolons or incorrect variable declarations.
- If the output is not as expected, verify that your strings are assigned the correct values and that you are using the methods properly.
- Remember that `trim()` only removes spaces at the beginning and end of the string, not spaces within the text.

Happy coding!