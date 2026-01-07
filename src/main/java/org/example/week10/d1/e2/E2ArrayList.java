package org.example.week10.d1.e2;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args){

        // Step 1: Create a `E2ArrayList` class with the following:
        // Initialize an ArrayList<Integer> to store product IDs.
        // Add the following product IDs to the list: 1011, 1022, 1033, 1044, 1055, 1066.
        // Retrieve the 1st, 3rd, and 5th product IDs from the list and print them to verify the products during the inventory check.
        // Step 2: Print the values of the 1st, 3rd, and 5th products from the inventory list.

        // Initialized an ArrayList<Integer> to store product IDs (Notes)
        ArrayList<Integer> productIds = new ArrayList<>();

        // Added product IDs to the list (Notes)
        productIds.add(1011);
        productIds.add(1022);
        productIds.add(1033);
        productIds.add(1044);
        productIds.add(1055);
        productIds.add(1066);

        // Retrieved and printed the 1st, 3rd, and 5th product IDs (Notes)
        System.out.println(productIds.get(0)); // 1st
        System.out.println(productIds.get(2)); // 3rd
        System.out.println(productIds.get(4)); // 5th

    }

}
