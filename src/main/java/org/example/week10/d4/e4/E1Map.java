package org.example.week10.d4.e4;

import java.util.LinkedHashMap;

public class E1Map {
    public static void main(String[] args) {

        /*
         * 1. Initialize a LinkedHashMap<String, String> called addressMap.
         *
         * 2. Add the following entries using put():
         *    - "Street" -> "Patrick ST"
         *    - "Suite" -> "265"
         *    - "City" -> "Vienna"
         *    - "Zip" -> "22180"
         *    - "Country" -> "United States"
         *
         * 3. Print the size of the map using addressMap.size().
         *
         * 4. Check if the map is empty using addressMap.isEmpty() and print the result.
         *
         * 5. Retrieve the value for the key "City" using addressMap.get("City") and print it.
         *
         * 6. Clear the map using addressMap.clear().
         *
         * 7. Check if the map is empty after clearing and print the result.
         *
         * Expected output:
         * Size: 5
         * Is map empty? false
         * City: Vienna
         * After clearing, is map empty? true
         */

        LinkedHashMap<String, String> addressMap = new LinkedHashMap<>();

        addressMap.put("Street", "Patrick ST");
        addressMap.put("Suite", "265");
        addressMap.put("City", "Vienna");
        addressMap.put("Zip", "22180");
        addressMap.put("Country", "United States");

        System.out.println("Size: " + addressMap.size());

        System.out.println("Is map empty? " + addressMap.isEmpty());

        System.out.println("City: " + addressMap.get("City"));

        addressMap.clear();

        System.out.println("After clearing, is map empty? " + addressMap.isEmpty());

    }

}
