package org.example.week3.d5.e2;

import java.util.Scanner;

public class E2SwitchClass {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter the type of meal (1 for breakfast, 2 for lunch, 3 for dinner)");
        String mealType= input.nextLine();

        double mealPrice;

        switch (mealType) {
            case "1":
                mealPrice=5.0;
                System.out.println("The price of your meal is $"+mealPrice);
                break;

            case "2":
                mealPrice=10.0;
                System.out.println("The price of your meal is $"+mealPrice);
                break;

            case "3":
                mealPrice=15.0;
                System.out.println("The price of your meal is $"+mealPrice);
                break;

            default:
                System.out.println("Invalid meal type entered");
                break;
        }
        input.close();

    }
}
