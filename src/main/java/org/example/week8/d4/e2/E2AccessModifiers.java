package org.example.week8.d4.e2;

public class E2AccessModifiers {
    public static void main(String[] args) {

        // 1. Declare Variables with Different Access Modifiers
        //1. Declare Variables with Different Access Modifiers
        //   Inside the AccessTester class, declare three variables:
        //   Private Variable (name):
        //     - Stores the student's name.
        //     - Access Modifier: private
        //     - Access Rule: Can only be accessed within the same class.
        //   Default (Package-Private) Variable (city):
        //     - Stores the city name.
        //     - Access Modifier: (no keyword, default access)
        //     - Access Rule: Can be accessed within the same package.
        //   Public Variable (batchNumber):
        //     - Stores the batch number.
        //     - Access Modifier: public
        //     - Access Rule: Can be accessed from anywhere.
        //2. Create a Method to Display Details
        //   - Method Name: display
        //   - Functionality: Prints:
        //       My name is ___ and I live in ___. I study at Syntax in batch ___.
        //   - Why Use This Method?
        //     The private variable name cannot be accessed directly in main, so we use this method inside the class to access and print it.
        //3. Assign Values and Call the display Method in main
        //   Step 1: Create an object of the AccessTester class.
        //   Step 2: Assign values to each variable:
        //     - name = "John"
        //     - city = "Miami"
        //     - batchNumber = 9
        //   Step 3: Call the display method to print the details.
        //4. Expected Output
        //   My name is John and I live in Miami. I study at Syntax in batch 9.


        }
}

