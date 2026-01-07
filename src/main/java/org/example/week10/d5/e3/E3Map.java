package org.example.week10.d5.e3;

import java.util.Map;
import java.util.TreeMap;

public class E3Map {
    public static void main(String[] args){

        TreeMap<String, String> productMap = new TreeMap<>();

        productMap.put("A001", "Apple");
        productMap.put("A003", "Pear");
        productMap.put("A002", "Banana");
        productMap.put("A005", "Mango");
        productMap.put("A004", "Tomato");

        for (Map.Entry<String, String> entry : productMap.entrySet()) {
            System.out.println("Product ID: " + entry.getKey() + ", Product Name: " + entry.getValue());
        }

    }

}