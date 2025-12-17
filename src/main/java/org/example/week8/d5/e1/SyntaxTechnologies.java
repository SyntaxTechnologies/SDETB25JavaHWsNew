package org.example.week8.d5.e1;

public class SyntaxTechnologies {


    String schoolName;
    int batch;
    int year;
    String lastDayOfClass;

    // Non-argument constructor (defaults: null, 0, 0, null)
    public SyntaxTechnologies() {
        // leaving fields as default values
    }

    // Parameterized constructor
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