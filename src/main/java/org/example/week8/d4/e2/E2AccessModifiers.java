package org.example.week8.d4.e2;

public class E2AccessModifiers {
    public static void main(String[] args) {

        AccessTester accessTester = new AccessTester();

        accessTester.setName("John");
        accessTester.city = "Miami";
        accessTester.batchNumber = 9;

        accessTester.display();
        }
}

