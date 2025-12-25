package org.example.week9.d4.e1;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    public void fetch() {
        System.out.println("Fetching the ball!");
    }
}
