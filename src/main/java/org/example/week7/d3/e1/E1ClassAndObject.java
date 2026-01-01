package org.example.week7.d3.e1;

public class E1ClassAndObject {
    public static void main(String[] args) {
        // Create a class in the same package named 'Student'

        // Declare a String variable named 'name' and an integer variable named 'roll_no'

        // Create an object of the class 'Student'

        // Assign the value "John" to the 'name' variable

        // Assign the value 2 to the 'roll_no' variable

        // Print the values of 'name' and 'roll_no' in the specified format

        Student s = new Student();

        s.name = "John";
        s.roll_no = 2;

        System.out.println("Name is "+s.name+" and roll number is "+s.roll_no);

    }
}
