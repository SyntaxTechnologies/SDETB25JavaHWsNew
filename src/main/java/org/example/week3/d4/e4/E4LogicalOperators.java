package org.example.week3.d4.e4;

import java.util.Scanner;

public class E4LogicalOperators {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Is it weekend? (true/false)");
        boolean isWeekend = input.nextBoolean();
        input.nextLine();

        System.out.println("Are you available? (true/false)");
        boolean isAvailable = input.nextBoolean();

        String subject;

        if (isWeekend && isAvailable) {
            subject = "Java";
        } else if (!isWeekend && isAvailable) {
            subject = "manual testing";
        } else if (!isAvailable) {
            subject = "no subject";
        } else {
            subject = "nothing";
        }

        System.out.println("Today you will be learning " + subject);
        input.close();
    }
}