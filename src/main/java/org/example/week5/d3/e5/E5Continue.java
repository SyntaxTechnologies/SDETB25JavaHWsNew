package org.example.week5.d3.e5;

public class E5Continue {
    public static void main(String[] args) {

        double[] readings = {15.5, -1.0, 20.0, 22.5, -2.0, 18.0, 21.5};


        for (double reading : readings) {


            if (reading < 0) {
                continue;
            }


            System.out.println("Valid reading: " + reading + " units");
        }



    }
}
