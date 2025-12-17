package org.example.week2.d5.e3;

public class E3ElseIf {
    public static void main(String[] args) {

<<<<<<< HEAD

        // Create two variables num1 and num2

        // create a variable to hold the operator

        // Perform operation using if-else if-else conditions

        // Statements to check the value of operator and perform the corresponding arithmetic operation:

        // If operator is "+", print The sum is: result.

        // If operator is "-", print The difference is: result.

        // If operator is "*", print The product is: result.

        // If operator is "/", print The quotient is: result.

        // If operator is any other value, print Invalid operator.




    }
}
=======
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



>>>>>>> origin/main
