package org.example.week2.d5.e3;

public class E3ElseIf {
    public static void main(String[] args) {

        String operator="*";
        double num1=5;
        double num2=10;
        double result;

        if (operator.equals("+")) {
            result = num1 + num2;
            System.out.println("The sum is: " + result);
        } else if (operator.equals("-")) {
            result = num1 - num2;
            System.out.println("The difference is: " + result);
        } else if (operator.equals("*")) {
            result = num1 * num2;
            System.out.println("The product is: " + result);
        } else if (operator.equals("/")) {
            result = num1 / num2;
            System.out.println("The quotient is: " + result);
        } else {
            System.out.println("Invalid operator");
        }
    }
}


