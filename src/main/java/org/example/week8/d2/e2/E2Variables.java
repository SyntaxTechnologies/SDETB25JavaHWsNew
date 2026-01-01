package org.example.week8.d2.e2;

public class E2Variables {

    static String ss = "Welcome To Syntax Technologies";

    public static void main(String[] args) {

        // Variable has been created already above.
        //Step 1: Print the Static Variable in Three Ways
        //        Inside the main method, print the static variable using these three different methods:
        //        Access the variable directly
        //        Since ss is static and inside the same class, you can call it without any prefix.
        //        Example:
        //        System.out.println(ss);
        //        Access using the class name
        //        Use the class name followed by the variable name.
        //        Example:
        //        System.out.println(E2Variables.ss);
        //        Access using an object of the class
        //        Create an object of E2Variables and use the object to call the static variable.
        //        Example:
        //        E2Variables obj = new E2Variables();
        //        System.out.println(obj.ss);
        //Step 4: Expected Output
        //        When the program runs, it should print:
        //        Welcome To Syntax Technologies
        //        Welcome To Syntax Technologies
        //        Welcome To Syntax Technologies

        System.out.println(ss);

        System.out.println(E2Variables.ss);

        E2Variables obj = new E2Variables();
        System.out.println(obj.ss);

    }
}
