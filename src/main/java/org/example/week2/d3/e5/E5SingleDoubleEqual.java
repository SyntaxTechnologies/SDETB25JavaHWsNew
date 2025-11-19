package org.example.week2.d3.e5;

public class E5SingleDoubleEqual {
    public static void main(String[] args) {

// Step 1: Declare variables with specific values
        int num1 = 10;
        int num2 = 10;

        // Step 2: Compare using the equality operator (==)
        boolean firstComparison = (num1 == num2);
        System.out.println(firstComparison);   // Expected: true

        // Step 3: Use the assignment operator (=) to change a value
        num1 = 20;  // assignment, not comparison

        // Step 4: Compare again using the equality operator (==)
        boolean secondComparison = (num1 == num2);
        System.out.println(secondComparison);  // Expected: false
    }
}
