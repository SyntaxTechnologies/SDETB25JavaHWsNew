package org.example.week3.d3.e4;

import java.util.Scanner;

public class E4NestedIfAndScanner {
    public static void main(String[] args) {
<<<<<<< HEAD
        // Create a Scanner Object
        Scanner scan = new Scanner(System.in);

        // Capture Input Information
        System.out.println("Please enter your coffee budget:");
        double budget = scan.nextDouble();

        // Clear the leftover newline after nextDouble()
        scan.nextLine();

        System.out.println("Do you prefer your coffee strong?");
        String preference = scan.nextLine(); // e.g., "strong"

        // Recommend a Coffee Drink
        if (budget >= 5.00) {
            // Nested if-else checking preference
            if (preference.equals("strong")) {
                System.out.println("You should try an Espresso!");
            } else {
                System.out.println("You should try a Latte!");
            }
        } else {
            System.out.println("You might enjoy a simple cup of Instant Coffee!");
        }

        scan.close();


=======
>>>>>>> origin/main

    }
}
