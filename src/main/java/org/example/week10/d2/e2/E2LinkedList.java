package org.example.week10.d2.e2;

import java.util.LinkedList;
import java.util.Collections;

public class E2LinkedList {

    public static void main(String[] args){

        /*
         * Heads Up This is a little bit tricky
         * 1. Create an ArrayList or LinkedList of Integer.
         * 2. Filter the list to remove ages not between 25 and 60:
         *    - Use ages.removeIf(age -> age < 25 || age > 60);
         *
         * 3. Sort the list:
         *    - Use Collections.sort(ages);
         *
         * 4. Calculate the average:
         *    - Initialize a sum variable to 0.
         *    - Loop through the list to add up all ages.
         *    - Compute the average as sum divided by the number of elements.
         *
         * 5. Print the results:
         *    - Print the sorted list of remaining ages.
         *    - Print the average age.
         *
         * Expected output should be:
         * Remaining ages: [30, 35, 40, 45, 50, 55, 60]
         * Average age: 45.0
         */

        LinkedList<Integer> ages = new LinkedList<>();

        ages.add(60);
        ages.add(30);
        ages.add(35);
        ages.add(70);
        ages.add(45);
        ages.add(50);
        ages.add(55);
        ages.add(22);
        ages.add(65);
        ages.add(40);

        ages.removeIf(age -> age < 25 || age > 60);

        Collections.sort(ages);

        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        double average = (double) sum / ages.size();

        System.out.println("Remaining ages: " + ages);
        System.out.println("Average age: " + average);

    }

}
