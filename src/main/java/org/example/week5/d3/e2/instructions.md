# Extract Slow Test Durations Using Enhanced For Loop

## Objective
Learn how to use 1D arrays and enhanced for loops in Java to extract and print specific values. In this exercise, you'll simulate a scenario for an automation engineer where you need to identify slow-running tests based on their execution times.

## Instructions

**Extract Slow Test Durations**

Imagine you have an automation test suite and you recorded the execution times (in seconds) of various tests. Your task is to print only those test durations that exceed a given threshold—these represent tests that are running slower than desired.

**For you to do:**

1. **Declare and Initialize the Array**
   - Create an array of integers representing test durations. For example, you can use the following values:  
     `{45, 82, 63, 95, 50, 70, 110, 55, 60}`.

2. **Set a Threshold for Slow Tests**
   - Decide on a threshold value for what you consider a slow test. For instance, tests that run longer than 70 seconds are flagged as slow.

3. **Extract and Print Slow Test Durations**
   - Use an enhanced for loop to iterate over the array.
   - Inside the loop, use an `if` statement to check if the current test duration exceeds the threshold.
   - If it does, print that test duration.

## Expected Output
```
82 95 110
```
## Tips
- **Enhanced For Loop:**  
  This loop lets you traverse the array without needing to manage an index manually.
- **Conditional Check:**  
  Use an `if` statement within the loop to compare each duration with your threshold.
- **Step-by-Step Approach:**
   1. Read each element from the array.
   2. Check if it meets the condition (greater than 70 seconds).
   3. Print the element if it meets the condition.


