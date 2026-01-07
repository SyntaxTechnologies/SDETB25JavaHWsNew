package org.example.week10.d1.e4;

import java.util.ArrayList;
import java.util.Scanner;

public class E4ArrayList {
    public static void main(String[] args){

        // Step 1: Create a `E5ArrayList` class with the following:
        // Initialize an ArrayList<String> to store chat messages entered by the user.
        // Use the Scanner class to input 5 chat messages from the user.
        // Simulate removing unwanted messages by removing the 1st, 3rd, and 5th elements (index 0, 2, and 4).
        // Print the remaining chat messages in a single line, separated by spaces.
        // Step 2: Input messages from the user, remove specific ones, and print the remaining messages in one line.

        ArrayList<String> messages = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 chat messages:");

        for (int i = 0; i < 5; i++) {
            messages.add(scanner.nextLine());
        }

        messages.remove(4);
        messages.remove(2);
        messages.remove(0);

        System.out.println("Remaining messages:");
        for (String msg : messages) {
            System.out.print(msg + " ");
        }

        scanner.close();

    }

}
