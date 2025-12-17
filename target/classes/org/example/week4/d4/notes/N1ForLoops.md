# FOR LOOPS IN JAVA

## 1) WHAT ARE FOR LOOPS?
A for loop is a control flow statement that repeatedly executes a block of code for a predetermined number of iterations. It is structured with an initialization, a condition, and an update expression, making it ideal for scenarios where the number of iterations is known in advance.

## 2) WHY DO WE NEED FOR LOOPS?
For loops are useful because they:
- **Provide Conciseness:** They encapsulate initialization, condition-checking, and updating in a single line.
- **Facilitate Iteration:** They are effective for performing a set number of repetitive tasks.
- **Enhance Readability:** Their compact syntax makes it easier to understand the loop's purpose and boundaries.

## 3) HOW DO WE USE FOR LOOPS? (EXAMPLES)

### Example #1: Print "Hello World" 5 Times
```java
for (int i = 0; i < 5; i++) {
    System.out.println("Hello World");
}
```
**Output:**
- Prints "Hello World" on 5 separate lines.

### Example #2: Print Numbers from 0 to 5
```java
for (int i = 0; i <= 5; i++) {
    System.out.println(i);
}
```
**Output:**
- Prints: 0, 1, 2, 3, 4, 5 (each on a new line)

### Example #3: Print Numbers in Reverse from 5 to 0
```java
for (int i = 5; i >= 0; i--) {
    System.out.println(i);
}
```
**Output:**
- Prints: 5, 4, 3, 2, 1, 0 (each on a new line)

## 4) COMMON MISTAKES

### Mistake #1: Incorrect Loop Boundaries
**Incorrect Example:**
```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
// This prints numbers 0 to 4, but if the intention was to include 5, the condition is off.
```
*Issue*: The loop condition should be `i <= 5` if you intend to print numbers from 0 to 5.

**Corrected Example:**
```java
for (int i = 0; i <= 5; i++) {
    System.out.println(i);
}
```

### Mistake #2: Modifying the Loop Variable Inside the Loop
**Incorrect Example:**
```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
    i = i + 1; // Modifying the loop variable within the loop body.
}
```
*Issue*: Changing the loop variable inside the loop body can lead to unexpected behavior or skipped iterations.

**Tip**: Let the loop control handle the update of the loop variable.

### Mistake #3: Off-by-One Errors
**Example:**
```java
for (int i = 1; i < 10; i++) {
    System.out.println(i);
}
```
*Issue*: If the goal is to print numbers 1 through 10, the condition should be `i <= 10`.

## 5) LIMITATIONS OF FOR LOOPS

- **Fixed Iteration Count:**  
  For loops are most effective when the number of iterations is known in advance. They are less flexible for conditions where the number of iterations depends on dynamic factors.

- **Not Suitable for Unknown Iteration Counts:**  
  When the number of iterations cannot be determined before the loop starts (e.g., processing input until a condition is met), while loops or do while loops may be a better choice.

&gt; **Note**: For loops in Java provide a concise and efficient way to perform repeated tasks when the iteration count is known. They are ideal for simple repetitive tasks, but for more dynamic scenarios, consider using while or do while loops.