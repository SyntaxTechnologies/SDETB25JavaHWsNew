package org.example.week5.d3.e3;

public class E3Break {
    public static void main(String[] args) {
<<<<<<< HEAD
        // Declare and initialize the array of temperature readings (°C)
        double[] temperatures = {36.5, 37.0, 37.5, 38.0, 39.5, 40.0, 40.5};

        // Iterate through the array using an enhanced for loop
        for (double temp : temperatures) {

            // Check for critical temperature
            if (temp >= 39.5) {
                System.out.println("Critical temperature reached: " + temp + "°C. Stopping monitoring.");
                break; // Exit the loop
            }

            // If not critical, print normal temperature
            System.out.println("Temperature is normal: " + temp + "°C");
        }
=======



>>>>>>> origin/main
    }
}
