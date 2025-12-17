package org.example.week3.d3.e2;

public class E2NestedIfElse {
    public static void main(String[] args) {



        int age = 16;          // person's age
        boolean isStudent = true; // is the person a student?

        // Check Age Eligibility for Discount
        if (age < 18) {
            System.out.println("You qualify for an age-based discount.");
        } else {
            // Nested Student Status Check
            if (isStudent) {
                System.out.println("You qualify for a student discount.");
            } else {
                System.out.println("You do not qualify for a discount.");
            }
        }

    }
}
