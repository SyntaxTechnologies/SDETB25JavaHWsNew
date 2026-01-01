package org.example.week5.d4.e2;

public class E2NestedForLoops {
    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {


            System.out.println("SDLC");


            for (int j = 0; j < 3; j++) {
                System.out.println("Java");
            }
        }





        for (int i = 0; i < 2; i++) {

            System.out.println("SDLC");  // Print SDLC once

            // Inner loop (print Java 3 times)
            for (int j = 0; j < 3; j++) {
                System.out.println("Java");
            }
        }
    }
}
