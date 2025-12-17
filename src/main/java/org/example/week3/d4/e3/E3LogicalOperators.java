package org.example.week3.d4.e3;

import java.util.Scanner;

public class E3LogicalOperators {
    public static void main(String[] args) {
<<<<<<< HEAD
        // Create a Scanner object
        Scanner scan = new Scanner(System.in);

        // Capture Boolean Inputs
        System.out.println("Are you thirsty? (true/false)");
        boolean isThirsty = scan.nextBoolean();

        System.out.println("Are you sleepy? (true/false)");
        boolean isSleepy = scan.nextBoolean();

        String drink;

        // Determine the Drink
        if (isThirsty && !isSleepy) {
            drink = "water";
        } else if (isThirsty && isSleepy) {
            drink = "coffee";
        } else if (!isThirsty && isSleepy) {
            drink = "tea";
        } else {
            drink = "nothing";
        }

        // Print the Drink Suggestion
        System.out.println("Looks like you need to drink " + drink);

        scan.close();
=======

// Thirsty or Sleepy
//
// Step 1: Create a Scanner object.

// Step 2: Capture Boolean Inputs.
//   - Ask the user: "Are you thirsty? (true/false)"
//   - Read the input and store it in a boolean variable named 'isThirsty'.
//   - Ask the user: "Are you sleepy? (true/false)"
//   - Read the input and store it in a boolean variable named 'isSleepy'.
//
// Step 3: Determine the Drink Suggestion.
//   - Use a conditional statement with logical operators to decide on a drink:
//       - If (isThirsty && !isSleepy), set 'drink' to "water".
//       - Else if (isThirsty && isSleepy), set 'drink' to "coffee".
//      intentionally not writing comments for the rest of statements think :)
//
// Step 4: Print the Drink Suggestion.
//   - Print out the message: "Looks like you need to drink " followed by the value of 'drink'.
//
// Reminder:
//   - Write your code step by step and test it to ensure the output matches the expected results.

>>>>>>> origin/main
    }
}
