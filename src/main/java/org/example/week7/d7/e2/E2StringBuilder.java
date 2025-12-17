package org.example.week7.d7.e2;

public class E2StringBuilder {
    public static void main(String[] strings) {


        String time = "1200";

        StringBuilder sb = new StringBuilder(time);
        sb.insert(2, ':'); // insert colon after "12"

        System.out.println("Original: " + time + ", Formatted: " + sb.toString());

    }
}