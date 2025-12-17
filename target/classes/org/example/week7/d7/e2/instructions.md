# StringBuilder Method Practice: insert()

## Objective
Practice using the `insert()` method of the `StringBuilder` class in Java to add a colon in a basic time string.

## Instructions

**Formatting a Time String**

In this exercise, you will create a simple program that formats a time string by inserting a colon between the hours and minutes. You'll use `StringBuilder` and its `insert()` method to manipulate the string.

For you to do:

1. Declare a `String` variable named `time` and assign it the value `"1200"`.
2. Create a `StringBuilder` object initialized with the time string declared in above instruction.
3. **Conversion Examples:**
   - **String to StringBuilder Conversion Example:**
     ~~~~java
     String time = "1200";
     StringBuilder sb = new StringBuilder(str);
     ~~~~
4. Use the `insert()` method to add a colon (`':'`) between the hours and minutes at index 2.
5. Print the original time string and its formatted version in the following format.

### Sample Output (for `String time = "1200"`):
~~~~text
Original: 1200, Formatted: 12:00
~~~~

## Tips

- The `insert()` method allows you to add content at a specific index in the `StringBuilder`.
- Convert the `StringBuilder` back to a `String` using the `toString()` method when needed.
- Remember that `StringBuilder` modifies the string in place, making it efficient for multiple operations.

## Troubleshooting

- Ensure you're using the correct method name (`insert`).
- Double-check the index when inserting – remember that string indices start at 0.