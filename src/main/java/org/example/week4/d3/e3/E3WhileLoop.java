package org.example.week4.d3.e3;

public class E3WhileLoop {
    public static void main(String[] args) {
        // Declare a counter variable and set it to 1
        int counter = 1;

        while (counter <= 13) {

            if (counter % 2 == 0) {
                System.out.println(counter);
            }
            counter++;
        }
    }
}
