package org.example.week10.d1.e2;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args){
        ArrayList<Integer> productIds = new ArrayList<>();

        // Add product IDs
        productIds.add(1011);
        productIds.add(1022);
        productIds.add(1033);
        productIds.add(1044);
        productIds.add(1055);
        productIds.add(1066);


        System.out.println(productIds.get(0));
        System.out.println(productIds.get(2));
        System.out.println(productIds.get(4));
    }

}
