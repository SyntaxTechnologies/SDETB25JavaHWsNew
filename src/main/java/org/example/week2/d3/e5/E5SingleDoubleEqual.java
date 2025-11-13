package org.example.week2.d3.e5;

public class E5SingleDoubleEqual {
    public static void main(String[] args) {

// Step 1: Declare Variables with Specific Values
//   - Declare an integer variable named 'num1' and assign it the value 10.
//   - Declare an integer variable named 'num2' and assign it the value 10.
        int num1=10;
        int num2=10;

// Step 2: Compare Using the Equality Operator (==)
        boolean result = num1 == num2;
//   - Compare 'num1' and 'num2' using '=='.
//   - Expected result: (num1 == num2) should output true.


// Step 3: Use the Assignment Operator (=) to Change a Value
//   - Assign a new value to 'num1' using '=' (for example, assign 20 to 'num1').
        num1=20;
//

// Step 4: Compare Again Using the Equality Operator (==)
//   - Compare 'num1' and 'num2' again using '=='.
        boolean isNum1=num1==num2;
//   - Expected result: (num1 == num2) should now output false because num1 is no longer equal to num2.

// Step 5: Print the Comparison Results
//   - Use print statements to display the outcomes of both equality comparisons.
        System.out.println(result);
        System.out.println(isNum1);


    }
}
