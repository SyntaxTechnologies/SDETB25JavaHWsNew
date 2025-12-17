package org.example.week3.d3.e5;

import java.util.Scanner;

public class E5NestedIfAndScanner {
    public static void main(String[] args) {

        // Create a Scanner Object
        Scanner scan = new Scanner(System.in);

        // Capture Input Information
        System.out.println("Please enter your age:");
        int age = scan.nextInt();

        // Clear leftover newline from nextInt()
        scan.nextLine();

        System.out.println("Do you have a valid driver's license? (yes/no):");
        String licenseStatus = scan.nextLine(); // e.g., "yes" or "no"

        // Check Car Rental Eligibility
        if (age >= 21) {
            // Nested check for license status
            if (licenseStatus.equals("yes")) {
                System.out.println("You are eligible to rent a car.");
            } else {
                System.out.println("You are not eligible to rent a car because you don't have a valid driver's license.");
            }
        } else {
            System.out.println("You are not eligible to rent a car because you are too young.");
        }

        scan.close();



    }
}
