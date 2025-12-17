package org.example.week3.d4.e2;

import java.util.Scanner;

public class E2LogicalOperators {
    public static void main(String[] args) {

<<<<<<< HEAD
        Scanner scan = new Scanner(System.in);

        // Capture Monthly Expenses
        System.out.println("Please enter your monthly rent expense");
        double rentExpense = scan.nextDouble();

        System.out.println("Please enter your monthly food expense");
        double foodExpense = scan.nextDouble();

        System.out.println("Please enter your monthly transportation expense");
        double transportationExpense = scan.nextDouble();

        System.out.println("Please enter your monthly entertainment expense");
        double entertainmentExpense = scan.nextDouble();

        // Analyze Expenses Using the && Operator
        if (rentExpense > foodExpense && transportationExpense > entertainmentExpense) {
            System.out.println("You are prioritizing essentials well.");
        } else {
            System.out.println("You need to rethink your spending priorities.");
        }

        scan.close();
=======

>>>>>>> origin/main
    }
}
