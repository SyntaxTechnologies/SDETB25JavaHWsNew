package org.example.week3.d5.e2;

import java.util.Scanner;

public class E2SwitchClass {
    public static void main(String[] args) {


        // Create a Scanner object
        Scanner scan = new Scanner(System.in);

        // Capture Meal Type Input
        System.out.println("Enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)");
        int mealType = scan.nextInt();

        double price = 0.0;
        boolean valid = true; // to track if the meal type is valid

        // Calculate Price using Switch Statement
        switch (mealType) {
            case 1:
                price = 5.0;   // Breakfast
                break;
            case 2:
                price = 10.0;  // Lunch
                break;
            case 3:
                price = 15.0;  // Dinner
                break;
            default:
                System.out.println("Invalid meal type entered");
                valid = false;
        }

        // Print the Price only if the meal type was valid
        if (valid) {
            System.out.println("The price of your meal is $" + price);
        }

        scan.close();
    }



    }

