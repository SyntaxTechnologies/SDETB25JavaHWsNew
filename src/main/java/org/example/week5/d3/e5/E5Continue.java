package org.example.week5.d3.e5;

public class E5Continue {
    public static void main(String[] args) {

        // Declare and initialize the array of sensor readings
        double[] readings = {15.5, -1.0, 20.0, 22.5, -2.0, 18.0, 21.5};

        // Iterate through the array using an enhanced for loop
        for (double reading : readings) {

            // Skip negative (invalid) readings
            if (reading < 0) {
                continue; // skip this reading and move to the next one
            }

            // Process valid (non-negative) reading
            System.out.println("Valid reading: " + reading + " units");
        }

    }
}
