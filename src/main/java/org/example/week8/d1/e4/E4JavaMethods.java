package org.example.week8.d1.e4;

public class E4JavaMethods {
    public static void main(String[] args) {

        /*
         * 1. Inside the NumberChecker class, create a method named isEven that accepts one int parameter.
         *
         * 2. In the method body, use the modulus operator (%) to determine if the number is even.
         *    - If (num % 2 == 0) then the number is even.
         *
         * 3. Return true if the number is even; otherwise, return false.
         *
         * 4. In the main method, call isEven with different values (for example, 4 and 7) and print the results.
         *
         * Expected Output:
         * true
         * false
         */
        System.out.println(NumberChecker.isEven(4));
        System.out.println(NumberChecker.isEven(7));

    }

}
