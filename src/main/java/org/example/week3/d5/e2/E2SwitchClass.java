package org.example.week3.d5.e2;

import java.util.Scanner;

public class E2SwitchClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Capture Meal Type Input
        System.out.println("Enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)");
        int mealType = input.nextInt();

        double price;

        // Calculate Price using Switch Statement
        switch (mealType) {
            case 1:
                price = 5.00;
                break;
            case 2:
                price = 10.00;
                break;
            case 3:
                price = 15.00;
                break;
            default:
                System.out.println("Invalid meal type entered");
                input.close();
                return; // Exit early since input is invalid
        }

        // Print the Price
        System.out.println("The price of your meal is $" + price);

        // Close Scanner
        input.close();




    }
}
