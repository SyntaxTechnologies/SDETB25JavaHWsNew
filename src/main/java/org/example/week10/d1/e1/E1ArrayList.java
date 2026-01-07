package org.example.week10.d1.e1;


import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<>();

        // Check if empty initially
        System.out.println(tasks.isEmpty());

        // Add a task
        tasks.add("Buy Groceries");

        // Check if empty again
        System.out.println(tasks.isEmpty());


    }

}
