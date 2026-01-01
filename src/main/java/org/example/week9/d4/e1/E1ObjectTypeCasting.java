package org.example.week9.d4.e1;

public class E1ObjectTypeCasting {

    public static void main(String[] args){


        /*
         *    - Create a Dog object and assign it to a variable of type Animal.
         *    - Call makeSound() on this Animal variable (it should print "Woof!").
         *    - Cast the Animal variable to a Dog variable.
         *    - Call fetch() on the Dog variable to print "Fetching the ball!".
         */

        Animal a = new Dog(); // upcasting
        a.makeSound();        // Woof!

        Dog d = (Dog) a;      // downcasting
        d.fetch();            // Fetching the ball!
    }
}
