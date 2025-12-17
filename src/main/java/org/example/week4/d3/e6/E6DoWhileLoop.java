package org.example.week4.d3.e6;

public class E6DoWhileLoop {
    public static void main(String[] args) {

        // Declare a counter variable and set it to 20
        int counter = 20;


        do {
            if (counter % 2 == 0) {
                System.out.println(counter);
            }

            counter -= 2;

        } while (counter >= 2);


    }
}
