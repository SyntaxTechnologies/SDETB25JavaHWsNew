package org.example.week10.d5.e3;

import java.util.Map;
import java.util.TreeMap;

public class E3Map {
    public static void main(String[] args){

        /*
         * 1. Declare and initialize a TreeMap<String, String> named productMap.
         *
         * 2. Add the following entries using put():
         *    - "A001" -> "Apple"
         *    - "A003" -> "Pear"
         *    - "A002" -> "Banana"
         *    - "A005" -> "Mango"
         *    - "A004" -> "Tomato"
         *
         * 3. A TreeMap sorts keys automatically in ascending order.
         *
         * 4. Use a for-each loop to iterate over productMap.entrySet() and print each entry in the format:
         *    "Product ID: [key], Product Name: [value]"
         *
         * Expected output:
         * Product ID: A001, Product Name: Apple
         * Product ID: A002, Product Name: Banana
         * Product ID: A003, Product Name: Pear
         * Product ID: A004, Product Name: Tomato
         * Product ID: A005, Product Name: Mango
         */

        TreeMap<String, String> productMap = new TreeMap<>();

        productMap.put("A001", "Apple");
        productMap.put("A003", "Pear");
        productMap.put("A002", "Banana");
        productMap.put("A005", "Mango");
        productMap.put("A004", "Tomato");

        for (Map.Entry<String, String> entry : productMap.entrySet()) {
            System.out.println(
                    "Product ID: " + entry.getKey() +
                            ", Product Name: " + entry.getValue()
            );
        }

    }

}