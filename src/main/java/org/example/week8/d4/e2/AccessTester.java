package org.example.week8.d4.e2;

public class AccessTester {

    private String name;

    String city;

    public int batchNumber;

    void display() {
        System.out.println(
                "My name is " + name +
                        " and I live in " + city +
                        ". I study at Syntax in batch " + batchNumber + "."
        );
    }

    // Setter for private variable
    void setName(String name) {
        this.name = name;

    }
}