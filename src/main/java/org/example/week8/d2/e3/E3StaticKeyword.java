package org.example.week8.d2.e3;

public class E3StaticKeyword {

    public static void main(String[] args) {

        /*
         * Hints for Adding Methods in the MessagePrinter Class:
         *
         * 1. Inside the MessagePrinter class, add a non-static method called nonStaticMethod.
         *    - This method should print "Programming is amazing.".
         *
         * 2. Also, add a static method called staticMethod.
         *    - This method should print "Java is awesome.".
         *
         * 3. In the main method (already provided), create an object of MessagePrinter.
         *    - Call nonStaticMethod using this object.
         *
         * 4. Then, call staticMethod using the class name: MessagePrinter.staticMethod().
         *
         * These steps will help you add the required methods to the existing class and call them correctly.
         */


        MessagePrinter printer = new MessagePrinter();
        printer.nonStaticMethod();

        MessagePrinter.staticMethod();


    }
}
