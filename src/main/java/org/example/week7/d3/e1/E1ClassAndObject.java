package org.example.week7.d3.e1;

public class E1ClassAndObject {
    public static void main(String[] args) {
        // Create an object of the class 'Student'
        Student student = new Student();

        // Assign the value "John" to the 'name' variable
        student.name = "John";

        // Assign the value 2 to the 'roll_no' variable
        student.roll_no = 2;

        // Print the values of 'name' and 'roll_no' in the specified format
        System.out.println("Name is " + student.name + " and roll number is " + student.roll_no);
    }
}
