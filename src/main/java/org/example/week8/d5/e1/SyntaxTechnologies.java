package org.example.week8.d5.e1;

public class SyntaxTechnologies {


    //          This class will have four instance variables to store school details.
    //          It will include two constructors (a no-argument constructor and a parameterized constructor).
    //          A display() method will print the values of the instance variables.
    //          Instance Variables
    //          Variable 1:
    //          Variable Name : schoolName
    //          Data Type : String
    //          Description : Stores the name of the school.
    //          Variable 2:
    //          Variable Name : batch
    //          Data Type : int
    //          Description : Stores the batch number.
    //          Variable 3:
    //          Variable Name : year
    //          Data Type : int
    //          Description : Stores the year of enrollment.
    //          Variable 4:
    //          Variable Name : lastDayOfClass
    //          Data Type : String
    //          Description : Stores the last day of class date.
    //2. Define Two Constructors
    //   Non-Argument Constructor:
    //   Initializes schoolName and lastDayOfClass to null.
    //   Initializes batch and year to 0.
    //   Parameterized Constructor:
    //   Accepts four parameters (schoolName, batch, year, lastDayOfClass).
    //   Assigns the provided values to the instance variables.
    //3. Create a display() Method
    //   This method prints all instance variables in the format:
    //   schoolName batch year lastDayOfClass

    String schoolName;
    int batch;
    int year;
    String lastDayOfClass;

    public SyntaxTechnologies() {
        this.schoolName = null;
        this.batch = 0;
        this.year = 0;
        this.lastDayOfClass = null;
    }

    public SyntaxTechnologies(String schoolName, int batch, int year, String lastDayOfClass) {
        this.schoolName = schoolName;
        this.batch = batch;
        this.year = year;
        this.lastDayOfClass = lastDayOfClass;
    }

    public void display() {
        System.out.println(schoolName + " " + batch + " " + year + " " + lastDayOfClass);
    }
}