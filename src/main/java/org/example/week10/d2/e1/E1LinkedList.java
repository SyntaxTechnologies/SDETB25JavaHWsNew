package org.example.week10.d2.e1;

import java.util.LinkedList;

public class E1LinkedList {

    public static void main(String[] args){

        LinkedList<Integer> numbers = new LinkedList<>();

        // Add integers from 50 to 100 (inclusive)
        for (int i = 50; i <= 100; i++) {
            numbers.add(i);
        }

        // Remove numbers that are NOT divisible by 3
        numbers.removeIf(num -> num % 3 != 0);

        // Print the filtered list
        System.out.println(numbers);
    }

}