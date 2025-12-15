package org.example.week7.d5.e3;

public class E3StringManipulationsP5 {
    public static void main(String[] args) {
        String phoneNumber = "(123) 456-7890";


        String cleanedNumber = phoneNumber.replaceAll("[^0-9]", "");


        System.out.println(cleanedNumber);





    }
}
