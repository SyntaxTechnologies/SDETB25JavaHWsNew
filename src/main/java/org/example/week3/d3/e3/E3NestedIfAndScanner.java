package org.example.week3.d3.e3;

import java.util.Scanner;

public class E3NestedIfAndScanner {
    public static void main(String[] args) {


        // 1. Create a Scanner object to read from the keyboard
        Scanner input = new Scanner(System.in);

        // 2. Prompt the user
        System.out.println("Please enter a number:");

        // 3. Read the number the user types
        int number = input.nextInt();

        // 4. Print the number back to the user
        System.out.println("You entered: " + number);

        // 5. Close the Scanner
        input.close();

    }
}
