package org.example.week4.d5.e2;

public class E2Arrays {
    public static void main(String[] args) {
        int[] numbers = {45, 78, 12, 67, 55, 89, 23, 77, 88};


        for (int i = 0; i < numbers.length; i += 2) {
            System.out.print(numbers[i] + " ");
        }
    }
}
