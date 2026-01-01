package org.example.week8.d6.e1;

public class E1Inheritance {

    public static void main(String[] args) {

        /*
         * 1. In the main method, create an instance of the Car class.
         * 2. Using the Object Assign values to the fields of the Car object:
         *    - Set the make to "Toyota"
         *    - Set the year to 2020
         *    - Set the model to "Corolla"
         * 3. Call the displayCarInfo() method on the Car object.
         * 4. The expected output should be:
         *      Vehicle: Toyota, Year: 2020
         *      Model: Corolla
         */

        Car car = new Car();

        car.make = "Toyota";
        car.year = 2020;
        car.model = "Corolla";

        car.displayCarInfo();

    }
}
