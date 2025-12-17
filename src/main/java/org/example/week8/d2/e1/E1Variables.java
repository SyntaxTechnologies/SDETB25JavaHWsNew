package org.example.week8.d2.e1;

public class E1Variables {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.year = 2050;
        s1.schoolName = "Syntax";
        s1.batchNumber = 200;

        Student s2 = new Student();
        s2.year = 2051;
        s2.schoolName = "Tech";
        s2.batchNumber = 300;

        System.out.println("I am a student of batch " + s1.batchNumber +
                " studying at " + s1.schoolName + " in the year of " + s1.year + ".");

        System.out.println("I am a student of batch " + s2.batchNumber +
                " studying at " + s2.schoolName + " in the year of " + s2.year + ".");
        }
}

