package org.example.week5.d3.e6;

public class E6Continue {
    public static void main(String[] args) {

<<<<<<< HEAD
        // Declare and initialize the array of inventory items
        String[] items = {"Item1", "Out of Stock", "Item2", "Item3", "Out of Stock", "Item4"};

        // Iterate through the array using an enhanced for loop
        for (String item : items) {

            // If the item is out of stock, skip it
            if (item.equals("Out of Stock")) {
                continue; // skip this iteration, go to the next item
            }

            // Process items that are in stock
            System.out.println("Processing " + item);
        }
=======

>>>>>>> origin/main
    }
}
