package org.example.week3.d3.e5;

import java.util.Scanner;

public class E5NestedIfAndScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Please enter your age: ");
        int age = input.nextInt();


        input.nextLine();

        System.out.print("Do you have a valid driver's license? (yes/no): ");
        String licenseStatus = input.nextLine();


        if (age >= 21) {

            if (licenseStatus.equalsIgnoreCase("yes")) {
                System.out.println("You are eligible to rent a car.");
            } else {
                System.out.println("You are not eligible to rent a car because you don't have a valid driver's license.");
            }
        } else {
            System.out.println("You are not eligible to rent a car because you are too young.");
        }


        input.close();


    }
}
