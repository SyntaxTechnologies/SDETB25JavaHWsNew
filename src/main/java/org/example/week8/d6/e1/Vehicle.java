package org.example.week8.d6.e1;

public class Vehicle {
  /*
   * 1. Declare two instance variables:
   *    - A String variable for the vehicle's make.
   *    - An int variable for the vehicle's year.
   * 2. Create a public method named displayInfo() that returns void.
   * 3. Inside displayInfo(), use System.out.println() to print a message that includes the make and year.
   *    - For example, print: "Vehicle: Toyota, Year: 2020"
   */

    String make;
    int year;

    public void displayInfo() {
        System.out.println("Vehicle: " + make + ", Year: " + year);
    }
}