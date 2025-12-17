package org.example.week7.d5.e3;

public class E3StringManipulationsP5 {
    public static void main(String[] args) {

        String phoneNumber = "(123) 456-7890";

        // Remove anything that is NOT a digit
        String cleaned = phoneNumber.replaceAll("\\D", "");

        System.out.println(cleaned);
    }
}
