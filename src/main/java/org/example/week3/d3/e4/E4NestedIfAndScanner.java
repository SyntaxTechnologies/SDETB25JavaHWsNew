package org.example.week3.d3.e4;

import java.util.Scanner;

public class E4NestedIfAndScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Please enter your coffee budget: ");
        double budget = input.nextDouble();


        input.nextLine();

        System.out.print("Do you prefer your coffee strong? ");
        String preference = input.nextLine();


        if (budget >= 5.00) {

            if (preference.equalsIgnoreCase("strong")) {
                System.out.println("You should try an Espresso!");
            } else {
                System.out.println("You should try a Latte!");
            }
        } else {
            System.out.println("You might enjoy a simple cup of Instant Coffee!");
        }


        input.close();
    }
}
