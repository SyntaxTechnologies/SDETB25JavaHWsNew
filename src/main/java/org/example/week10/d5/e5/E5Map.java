package org.example.week10.d5.e5;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class E5Map {

    public static void main(String[] args) {

        HashMap<String, List<String>> studentsBySubject = new HashMap<>();

        List<String> mathStudents = new ArrayList<>();
        mathStudents.add("Alice");
        mathStudents.add("Bob");
        studentsBySubject.put("Mathematics", mathStudents);

        List<String> scienceStudents = new ArrayList<>();
        scienceStudents.add("Charlie");
        scienceStudents.add("David");
        studentsBySubject.put("Science", scienceStudents);

        List<String> historyStudents = new ArrayList<>();
        historyStudents.add("Eve");
        historyStudents.add("Frank");
        studentsBySubject.put("History", historyStudents);

        System.out.println("From Map (Students by Subject):");
        for (Map.Entry<String, List<String>> entry : studentsBySubject.entrySet()) {
            System.out.println("Subject: " + entry.getKey() + " Students: " + entry.getValue());
        }

    }
    }
