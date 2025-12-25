package org.example.week8.d2.e1;

public class E1Variables {

    public static void main(String[] args) {

        /*
         * 1. In your Student class, declare three instance variables:
         *    - int year;
         *    - String schoolName;
         *    - int batchNumber;
         *
         * 2. In your main method, create two objects of the Student class.
         *
         * 3. For the first object, assign:
         *      - year = 2050
         *      - schoolName = "Syntax"
         *      - batchNumber = 200
         *
         * 4. For the second object, assign:
         *      - year = 2051
         *      - schoolName = "Tech"
         *      - batchNumber = 300
         *
         * 5. Use System.out.println to print the details for each student in the following format:
         *      "I am a student of batch [batchNumber] studying at [schoolName] in the year of [year]."
         *
         * 6. Ensure you print the details for both objects.
         */

        Student student1 = new Student();
        student1.year = 2050;
        student1.schoolName = "Syntax";
        student1.batchNumber = 200;


        Student student2 = new Student();
        student2.year = 2051;
        student2.schoolName = "Tech";
        student2.batchNumber = 300;


        System.out.println("I am a student of batch " + student1.batchNumber +
                " studying at " + student1.schoolName +
                " in the year of " + student1.year + ".");

        System.out.println("I am a student of batch " + student2.batchNumber +
                " studying at " + student2.schoolName +
                " in the year of " + student2.year + ".");

        }
}

