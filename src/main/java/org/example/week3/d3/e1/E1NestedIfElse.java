package org.example.week3.d3.e1;

public class E1NestedIfElse {
    public static void main(String[] args) {


        int age = 14;
        int height = 125;

        // Check Age Eligibility
        if (age >= 12) {
            // Nested Height Check
            if (height >= 120) {
                System.out.println("You are eligible to ride the roller coaster.");
            } else {
                System.out.println("You are old enough, but not tall enough to ride the roller coaster.");
            }
        } else {
            System.out.println("You are not old enough to ride the roller coaster.");
        }

    }
}
