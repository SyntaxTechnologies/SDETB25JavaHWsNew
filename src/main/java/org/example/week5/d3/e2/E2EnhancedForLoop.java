package org.example.week5.d3.e2;

public class E2EnhancedForLoop {
    public static void main(String[] args) {

        int [] test = {45, 82, 63, 95, 50, 70, 110, 55, 60};
        int threshold = 70;

        for (int duration:test) {
            if (duration>threshold) {
                System.out.print(duration + " ");
            }
        }



    }
}
