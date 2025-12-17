# Print Pattern using Nested Loops

## Objective
Learn how to use nested loops in Java to print a repeating pattern. In this exercise, you'll print "SDLC" on one line and then print "Java" on separate lines three times. The entire pattern will repeat twice.

## Instructions

**Print the Pattern Using Nested Loops**

In this project, you will write a small program that:
1. Uses an outer loop that runs 2 times.
2. For each iteration of the outer loop, prints "SDLC" on a new line.
3. Uses an inner loop (nested inside the outer loop) that runs 3 times.
4. For each iteration of the inner loop, prints "Java" on a new line.

**For you to do:**

1. **Set Up the Outer Loop**
    - The outer loop should control the repetition of the entire pattern. It runs 2 times.

2. **Print "SDLC"**
    - Inside the outer loop, first print the string "SDLC" and then move to a new line.

3. **Set Up the Inner Loop to Print "Java"**
    - Within the outer loop, add an inner loop that runs 3 times.
    - For each iteration of the inner loop, print the word "Java" on a new line.

## Expected Output
```
SDLC
Java
Java
Java
SDLC
Java
Java
Java
```

## Tips
- **Nested Loops:**  
  The outer loop controls the number of pattern repetitions (2 times), while the inner loop handles printing "Java" (3 times per repetition).
- **New Lines:**  
  Use `System.out.println()` to ensure that each word is printed on a new line.
- **Pseudocode Approach:**
  ```
  For each repetition from 1 to 2:
      Print "SDLC" and move to a new line.
      For each count from 1 to 3:
           Print "Java" and move to a new line.
  ```
- **Real-Life Analogy:**  
  Think of the outer loop as creating a section of a banner. For each section, you first write the title "SDLC," then list the word "Java" three times, each on its own line. You repeat this section to create the full banner.

## Additional Information
- **Outer Loop:**  
  Determines how many times the entire pattern is printed.
- **Inner Loop:**  
  Handles the repeated printing of "Java" within each pattern block.
- **Loop Control:**  
  Ensure your loops run for the correct number of iterations to match the expected output.

## Troubleshooting
- If your program doesn't compile, check for syntax errors such as missing semicolons or braces.
- If the output does not match the expected pattern, verify that:
    - The outer loop is set to run 2 times.
    - The inner loop is set to run 3 times for each outer loop iteration.
    - You are using the correct print methods to create new lines.

> **Note**: This exercise is designed to help you understand the use of nested loops in Java. Try to implement the solution by writing your pseudocode first and then translating it into code. Happy coding!