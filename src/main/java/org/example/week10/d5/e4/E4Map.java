package org.example.week10.d5.e4;

import java.util.LinkedHashMap;
import java.util.Map;

public class E4Map {
    public static void main(String[] args) {


        // Initialize a `HashMap<Integer, String>` where the key represents the student ID, and the value represents the student name.
        // Step 2: Add the following student records to the HashMap:
        // Add `101 = "John"`, `102 = "Emily"`, `103 = "Michael"`, `104 = "Sarah"`, `105 = "David"`.
        // Step 3: Use the `keySet()` method to retrieve all the keys (student IDs) from the HashMap.
        // Use a loop to iterate through the keys of the HashMap and print each student ID in the format:"Student ID: [key]".
        // Step 4: Use the `values()` method to retrieve all the values (student names) from the HashMap.
        // Use a loop to iterate through the values of the HashMap and print each student name in the format:"Student Name: [value]".
        // Step 5: Use the `entrySet()` method** to retrieve both keys and values as `Map.Entry` objects from the HashMap.
        // Use a loop to iterate through both keys and values of the HashMap and print each student ID and name in the format:"Student ID: [key], Student Name: [value]".

        Map<Integer, String> students = new LinkedHashMap<>();
        students.put(101, "John");
        students.put(102, "Emily");
        students.put(103, "Michael");
        students.put(104, "Sarah");
        students.put(105, "David");

        System.out.println("Student IDs:");
        for (Integer id : students.keySet()) {
            System.out.println("Student ID: " + id);
        }

        System.out.println();

        System.out.println("Student Names:");
        for (String name : students.values()) {
            System.out.println("Student Name: " + name);
        }

        System.out.println();

        System.out.println("Student Records:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() + ", Student Name: " + entry.getValue());
        }

    }
}