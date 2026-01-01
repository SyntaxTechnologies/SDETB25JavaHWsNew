package org.example.week8.d6.e2;

public class E2Inheritance {
    public static void main(String[] args) {


        /*
        Step 1,2,3 are in Animal and Mammal

         * Step 4: In the main class (E2Inheritance.java):
         *   - Create an instance of the Dog class.
         *   - Call the following methods separately on the Dog object:
         *         displayAnimalInfo()
         *         displayMammalInfo()
         *         displayDogInfo()
         *   - This will print each message on a separate line.
         *
         * The expected output is:
         * I am an animal.
         * I am a mammal.
         * I am a dog.
         *
         * Follow these steps to complete your exercise without using method chaining.
         */

        Dog dog = new Dog();

        dog.displayAnimalInfo();
        dog.displayMammalInfo();
        dog.displayDogInfo();

}
}
