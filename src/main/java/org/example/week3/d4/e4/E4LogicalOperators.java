package org.example.week3.d4.e4;

import java.util.Scanner;

public class E4LogicalOperators {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        // Capture Boolean Inputs
        System.out.println("Is it weekend? (true/false)");
        boolean isWeekend = scan.nextBoolean();

        System.out.println("Are you available? (true/false)");
        boolean isAvailable = scan.nextBoolean();

        String subject;

        // Determine the Subject
        if (isWeekend && isAvailable) {
            subject = "Java";
        } else if (!isWeekend && isAvailable) {
            subject = "manual testing";
        } else {
            subject = "no subject";
        }

        // Print the Subject
        System.out.println("Today you will be learning " + subject);

        scan.close();

    }
}
