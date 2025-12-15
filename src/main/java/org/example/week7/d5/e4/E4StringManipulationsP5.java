package org.example.week7.d5.e4;

public class E4StringManipulationsP5 {
    public static void main(String[] args) {

        String csvLine = "John Doe,22,Computer Science,3.8,2025";


        String[] fields = csvLine.split(",");


        for(int i = 0; i < fields.length; i++) {
            System.out.println(fields[i]);
        }
    }
}
