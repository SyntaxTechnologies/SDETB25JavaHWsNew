package org.example.week10.d2.e2;

import java.util.Collections;
import java.util.LinkedList;

public class E2LinkedList {
    public static void main(String[] args){

        LinkedList<Integer> ages = new LinkedList<>();

        // Add the 10 ages
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

        // Calculate average
        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        double average = (double) sum / ages.size();

        // Print results
        System.out.println("Remaining ages: " + ages);
        System.out.println("Average age: " + average);

    }

}
