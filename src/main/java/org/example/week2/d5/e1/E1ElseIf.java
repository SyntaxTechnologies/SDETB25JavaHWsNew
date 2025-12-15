package org.example.week2.d5.e1;

public class E1ElseIf {
    public static void main(String[] args) {

        int day=3;
        String activity;

        if (day==1){
            activity="Monday: Attend classes.";
            System.out.println("Monday: Attend classes.");

        } else if (day==2) {
            activity="Tuesday: Library visit.";
            System.out.println("Tuesday: Library visit.");
            
        } else if (day==3) {
            activity="Wednesday: Group study session.";
            System.out.println("Wednesday: Group study session.");

        } else if (day==4) {
            activity="Thursday: Lab work.";
            System.out.println("Thursday: Lab work.");

        } else if (day==5) {
            activity="Friday: Sports day.";
            System.out.println("Friday: Sports day.");

        } else if (day==6) {
            activity="Saturday: Free day for hobbies.";
            System.out.println("Saturday: Free day for hobbies.");

        } else if (day==7) {
            activity = "Sunday: Family time.";
            System.out.println("Sunday: Family time.");
        }else {
            activity="Invalid day number. Please enter a number between 1 and 7.";

        }


        // Declare a variable `day` (of type `int`) and assign it a value of 3.
        // If day equals 1, print "Monday: Attend classes."
        // Else if day equals 2, print "Tuesday: Library visit."
        // Else if day equals 3, print "Wednesday: Group study session."
        // Else if day equals 4, print "Thursday: Lab work."
        // Else if day equals 5, print "Friday: Sports day."
        // Else if day equals 6, print "Saturday: Free day for hobbies."
        // Else if day equals 7, print "Sunday: Family time."
        // Print the day and corresponding activity in the format: "Day <day>: <activity>"


    }
}
