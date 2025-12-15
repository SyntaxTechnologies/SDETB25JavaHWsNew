package org.example.week3.d3.e3;

import java.util.Scanner;

public class E3NestedIfAndScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Please enter a number: ");


        int number = input.nextInt();

        System.out.println("You entered: " + number);


        input.close();
    }
}
