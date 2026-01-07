package org.example.week10.d4.e3;

import java.util.LinkedHashSet;

public class E3Set {
    public static void main(String[] args) {
        LinkedHashSet<String> emails = new LinkedHashSet<>();

        emails.add(null);
        emails.add("john.doe@example.com");
        emails.add("jane.smith@example.com");
        emails.add("john.doe@example.com"); // duplicate
        emails.add("admin@event.com");
        emails.add("info@company.com");

        System.out.println("Email List using For-Each:");
        for (String email : emails) {
            System.out.println(email);
        }
    }
}
