# Printing All Elements from a 2D Array

## Objective
Learn how to access and print all elements of a 2D array in Java using nested loops.

## Instructions

**Print All Elements from a 2D Array**

In this exercise, you will write a program that:
1. Declares and initializes a 2D array of integers.
2. Uses nested loops to traverse the array.
3. Prints each element in the array, maintaining the original matrix format.

**For you to do:**

1. **Declare and Initialize the 2D Array**
    - Create a 2D array of integers with the following values:
      ```
      1  2  3  4
      5  6  7  8
      9 10 11 12
      ```

2. **Traverse and Print the Array**
    - Use an outer loop to iterate over each row of the array.
    - Use an inner loop to iterate over each element in the current row.
    - Print each element followed by a space.
    - After finishing each row, print a newline to start the next row.

## Expected Output
```
1 2 3 4
5 6 7 8
9 10 11 12
```

## Tips
- **Nested Loops:**  
  The outer loop will iterate through the rows, while the inner loop will iterate through each element (column) in the row.
- **Maintaining Format:**  
  Use `System.out.print()` to print elements on the same line and `System.out.println()` to move to the next line after each row.
- **Visualize the Matrix:**  
  Think of the 2D array as a table where each row is a line in your output. The outer loop selects a row, and the inner loop prints all items in that row.

## Additional Information
- **2D Arrays:**  
  A 2D array can be visualized as an array of arrays or a table with rows and columns.
- **Looping Constructs:**  
  Nested loops are used to traverse multi-dimensional arrays; the outer loop handles rows, and the inner loop handles columns.

## Troubleshooting
- **Compilation Errors:**
    - Check for syntax issues such as missing semicolons or braces.
    - Ensure that your loop variables are correctly defined.
- **Incorrect Output:**
    - Verify that you are printing a newline after each row.
    - Make sure that all elements are being printed and the spacing is correct.

