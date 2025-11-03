package org.example.week1.d5.e4;

public class E4ArithmeticOperations {

    public static void main(String[] args) {
        // Step 1: Declare the integer variables and assign values
        int width, height, perimeter, area;
        width=5;
        height=8;


        // Step 2: Calculate the perimeter
        perimeter= 2 *(width + height);

        // Step 3: Calculate the area
        area = width * height;


        // Step 4: Print the results
       System.out.println("The perimeter of a rectangle with width " + width + " and height " + height + " is equal to " + perimeter + " and the area equals to " + area);
    }
}
