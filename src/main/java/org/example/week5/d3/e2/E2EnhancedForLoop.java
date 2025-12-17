package org.example.week5.d3.e2;

public class E2EnhancedForLoop {
    public static void main(String[] args) {

        // Declare and initialize the array of test durations (in seconds)
        int[] testDurations = {45, 82, 63, 95, 50, 70, 110, 55, 60};

        // Set a threshold for slow tests (in seconds)
        int slowThreshold = 70;

        // Extract and print slow test durations using an enhanced for loop
        for (int duration : testDurations) {
            if (duration > slowThreshold) {
                System.out.print(duration + " ");
            }
        }



    }
}
