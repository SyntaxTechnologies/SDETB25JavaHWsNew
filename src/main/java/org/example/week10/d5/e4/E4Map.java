package org.example.week10.d5.e4;

import java.util.HashMap;
import java.util.Map;

public class E4Map {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

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