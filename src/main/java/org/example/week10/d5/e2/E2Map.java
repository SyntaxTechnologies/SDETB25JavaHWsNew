package org.example.week10.d5.e2;


import java.util.HashMap;
import java.util.Map;

public class E2Map {

    public static void main(String[] args) {

        HashMap<Integer, String> catalog = new HashMap<>();

        catalog.put(101, "The Catcher in the Rye");
        catalog.put(102, "To Kill a Mockingbird");
        catalog.put(103, "1984");
        catalog.put(104, "The Great Gatsby");
        catalog.put(105, "Moby Dick");

        System.out.println("Initial number of books in catalog: " + catalog.size());
        System.out.println("Is the catalog empty? " + catalog.isEmpty());
        System.out.println("Is book with ID 102 available? " + catalog.containsKey(102));
        System.out.println("Is the book \"1984\" available? " + catalog.containsValue("1984"));

        catalog.remove(105);
        System.out.println("Updated catalog after removing ID 105:");
        for (Map.Entry<Integer, String> entry : catalog.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        catalog.clear();
        System.out.println("Is the catalog empty after clearing? " + catalog.isEmpty());
    }

}
