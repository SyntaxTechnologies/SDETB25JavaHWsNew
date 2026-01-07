package org.example.week10.d4.e1;

import java.util.HashSet;

public class E1Set {
    public static void main(String[] args) {

        HashSet<Integer> customerIds = new HashSet<>();
        customerIds.add(1001);
        customerIds.add(1002);
        customerIds.add(1001);
        customerIds.add(1003);
        customerIds.add(1002);
        customerIds.add(1004);

        for (Integer id : customerIds) {
            System.out.println(id);
        }

    }
}

