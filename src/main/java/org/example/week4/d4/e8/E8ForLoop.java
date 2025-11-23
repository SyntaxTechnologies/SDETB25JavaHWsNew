package org.example.week4.d4.e8;

import java.util.Scanner;

public class E8ForLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt the user
        System.out.print("In: ");

        // Read user input
        int x = input.nextInt();

        // For loop: start at x - 1 and go down to 0
        for (int i = x - 1; i >= 0; i--) {
            System.out.print(i + " ");
        }

        input.close();
    }
}
