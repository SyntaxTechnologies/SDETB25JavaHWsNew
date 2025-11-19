package org.example.week3.d4.e3;

import java.util.Scanner;

public class E3LogicalOperators {
    public static void main(String[] args) {
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
    }
}
