package org.example.week5.d3.e3;

public class E3Break {
    public static void main(String[] args) {

        double[] temperatures = {36.5, 37.0, 37.5, 38.0, 39.5, 40.0, 40.5};


        for (double temp : temperatures) {


            if (temp >= 39.5) {
                System.out.println("Critical temperature reached: " + temp + "°C. Stopping monitoring.");
                break;
            }


            System.out.println("Temperature is normal: " + temp + "°C");
        }

    }
}
