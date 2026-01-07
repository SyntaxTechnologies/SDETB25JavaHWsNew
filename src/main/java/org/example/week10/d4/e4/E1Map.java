package org.example.week10.d4.e4;

import java.util.LinkedHashMap;

public class E1Map {
    public static void main(String[] args) {

        LinkedHashMap<String, String> addressMap = new LinkedHashMap<>();

        // Add address details
        addressMap.put("Street", "Patrick ST");
        addressMap.put("Suite", "265");
        addressMap.put("City", "Vienna");
        addressMap.put("Zip", "22180");
        addressMap.put("Country", "United States");

        // Display map information
        System.out.println("Size: " + addressMap.size());
        System.out.println("Is map empty? " + addressMap.isEmpty());
        System.out.println("City: " + addressMap.get("City"));

        // Clear the map and verify
        addressMap.clear();
        System.out.println("After clearing, is map empty? " + addressMap.isEmpty());

    }

}
