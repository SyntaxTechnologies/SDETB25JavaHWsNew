package org.example.week7.d4.e2;

public class E2StringManipulationsP2 {
    public static void main(String[] args) {
        String email = "john.doe@example.com";


        boolean containsAt = email.contains("@");
        boolean startsWithInfo = email.startsWith("info");
        boolean endsWithCom = email.endsWith(".com");


        System.out.println(containsAt);
        System.out.println(startsWithInfo);
        System.out.println(endsWithCom);



    }
}
