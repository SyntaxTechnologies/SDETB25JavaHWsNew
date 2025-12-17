package org.example.week7.d4.e1;

public class E1StringManipulationsP2 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "";
        String s3 = "   "; // three spaces

        // Check if the strings are empty
        System.out.println("Is s1 empty? " + s1.isEmpty());
        System.out.println("Is s2 empty? " + s2.isEmpty());
        System.out.println("Is s3 empty? " + s3.isEmpty());

        // Create a string with extra spaces
        String text = " LearnJava ";

        // Trim and print result
        System.out.println(text.trim());



    }
}
