package org.example.week9.d4.e1;

public class Dog extends Animal{
    /*
     * Extends the Animal class.
     *    - Override the makeSound() method to print "Woof!".
     *    - Add a method fetch() that prints "Fetching the ball!".
     */

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    public void fetch() {
        System.out.println("Fetching the ball!");
    }
}

