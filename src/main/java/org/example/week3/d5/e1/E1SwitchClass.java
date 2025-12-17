package org.example.week3.d5.e1;

import java.util.Scanner;

public class E1SwitchClass {
    public static void main(String[] args) {
<<<<<<< HEAD
        // Create a Scanner object to read input
        Scanner scan = new Scanner(System.in);

        // Capture Instructor Name
        System.out.println("Enter name of the instructor");
        String instructorName = scan.nextLine();

        String responsibility;

        // Determine Responsibility
        switch (instructorName) {
            case "Asghar":
                responsibility = "Will take care of Java Assignment";
                break;
            case "Sohail":
                responsibility = "Will take care of SDLC Assignment";
                break;
            case "Moazzam":
                responsibility = "Will take care of Selenium Assignment";
                break;
            case "Asel":
                responsibility = "Will take care of every Assignment";
                break;
            default:
                responsibility = "Invalid instructor selected";
        }

        // Print the Responsibility
        System.out.println(responsibility);

        scan.close();
=======
>>>>>>> origin/main



    }
}
