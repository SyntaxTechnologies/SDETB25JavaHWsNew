package org.example.week3.d4.e2;

import java.util.Scanner;

public class E2LogicalOperators {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Please enter your monthly rent expense");
        double rentExpense = input.nextDouble();

        System.out.println("Please enter your monthly food expense");
        double foodExpense = input.nextDouble();

        System.out.println("Please enter your monthly transportation expense");
        double transportationExpense = input.nextDouble();

        System.out.println("Please enter your monthly entertainment expense");
        double entertainmentExpense = input.nextDouble();


        if (rentExpense > foodExpense && transportationExpense > entertainmentExpense) {
            System.out.println("You are prioritizing essentials well.");
        } else {
            System.out.println("You need to rethink your spending priorities.");
        }


        input.close();




    }
}
