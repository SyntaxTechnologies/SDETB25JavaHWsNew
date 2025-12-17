package org.example.week8.d2.e3;

public class E3StaticKeyword {

    public static void main(String[] args) {

        MessagePrinter mp = new MessagePrinter();
        mp.nonStaticMethod();

        MessagePrinter.staticMethod();

    }
}
