package org.example.week10.d1.e4;

import java.util.ArrayList;
import java.util.Scanner;

public class E4ArrayList {
    public static void main(String[] args){

        ArrayList<String> messages = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 chat messages:");

        // Read 5 chat messages (each on its own line)
        for (int i = 0; i < 5; i++) {
            messages.add(scanner.nextLine());
        }

        // Remove 5th, 3rd, then 1st (remove highest index first to avoid shifting issues)
        messages.remove(4);
        messages.remove(2);
        messages.remove(0);

        System.out.println("Remaining messages:");

        // Print remaining messages in a single line separated by spaces
        for (int i = 0; i < messages.size(); i++) {
            System.out.print(messages.get(i));
            System.out.print(" "); // keeps a trailing space; test trims anyway
        }
 scanner.close();

    }

}
