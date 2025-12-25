package org.example.week9.d4.e1;

public class E1ObjectTypeCasting {

    public static void main(String[] args){
        Animal animal = new Dog();

        animal.makeSound(); // Woof!
        Dog dog = (Dog) animal;
        dog.fetch();
    }

}
