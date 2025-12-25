package org.example.week8.d5.e2;

public class E2Constructor {
    public static void main(String[] args) {

        //Step 4: Inside E2Constructor Class
        //        In the MainClass, create multiple objects of the Car class using each of the four constructors.
        //        Call the display() method on each object to print the values of the instance variables.
        //Step 5: Expected Output
        //        The output for different constructors should be as follows:
        //        Toyota Prius 4 120 30000.0
        //        Toyota Prius 4 120 30000.0
        //        unknown unknown 4 120 30000.0
        //        Toyota Prius 4 90 0.0

        Car car1 = new Car("Toyota", "Prius", 4, 120, 30000.0);

        Car car2 = new Car("Toyota", "Prius", 120, 30000.0);

        Car car3 = new Car(4, 120, 30000.0);

        Car car4 = new Car("Toyota", "Prius", 4);

        car1.display();
        car2.display();
        car3.display();
        car4.display();

    }
}


