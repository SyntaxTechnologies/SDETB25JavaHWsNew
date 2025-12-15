package org.example.week5.d3.e2;

public class E2EnhancedForLoop {
    public static void main(String[] args) {
        int[] testDurations = {45, 82, 63, 95, 50, 70, 110, 55, 60};


        int threshold = 70;


        System.out.println("Slow tests (duration > " + threshold + " seconds):");
        for (int duration : testDurations) {
            if (duration > threshold) {
                System.out.println(duration);
            }
        }
    }
}
