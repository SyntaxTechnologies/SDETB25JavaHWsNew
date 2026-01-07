package org.example.week10.d1.e3;

import java.util.ArrayList;

public class E3ArrayList {
    public static void main(String[] args){

        ArrayList<Integer> orders = new ArrayList<>();

        // Add order quantities
        orders.add(10);
        orders.add(20);
        orders.add(15);
        orders.add(30);
        orders.add(25);

        // Print each order quantity on a separate line
        for (int i = 0; i < orders.size(); i++) {
            System.out.println(orders.get(i));
        }
    }

}
