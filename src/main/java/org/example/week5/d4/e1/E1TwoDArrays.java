package org.example.week5.d4.e1;

public class E1TwoDArrays {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values
        int[][] a = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        for (int[] ints : a) {            // rows
            for (int anInt : ints) {     // columns
                System.out.print(anInt + " ");
            }
            System.out.println(); // move to the next line after each row
        }


    }
}
