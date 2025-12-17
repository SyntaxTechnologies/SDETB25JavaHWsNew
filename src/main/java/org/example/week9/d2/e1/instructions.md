# Implementing Overloaded Methods for Calculating Loan Payments

## Objective
Learn how to use method overloading in Java by creating several methods with the same name but different parameters. In this exercise, you will create methods that calculate monthly loan payments based on different inputs.

## Instructions

1. **Update the LoanPaymentCalculator Class**
   - In the existing `LoanPaymentCalculator.java` file, create three overloaded methods all named `calculatePayment`:

     **Method 1: Calculate Payment with Two Parameters**
      - Signature: `calculatePayment(double loanAmount, double interestRate)`
      - Calculation:
        ```
        payment = (loanAmount * (1 + interestRate / 100)) / 12
        ```
      - Return the calculated payment.

     **Method 2: Calculate Payment with Three Parameters**
      - Signature: `calculatePayment(double loanAmount, double interestRate, double numberOfMonths)`
      - Calculation:
        ```
        payment = (loanAmount * (1 + interestRate / 100)) / numberOfMonths
        ```
      - Return the calculated payment.

     **Method 3: Calculate Payment with Four Parameters**
      - Signature: `calculatePayment(double loanAmount, double interestRate, double numberOfMonths, double downPayment)`
      - Calculation:
        ```
        payment = ((loanAmount - downPayment) * (1 + interestRate / 100)) / numberOfMonths
        ```
      - Return the calculated payment.

2. **Test the Methods in the Main Class**
   - In the existing `E2MethodOverloading.java` class (which contains the main method), do the following:
      - Create an object of the `LoanPaymentCalculator` class.
      - Call the `calculatePayment` method with two arguments (e.g., `10000, 5`) and print the result.
      - Call the `calculatePayment` method with three arguments (e.g., `10000, 5, 24`) and print the result.
      - Call the `calculatePayment` method with four arguments (e.g., `10000, 5, 24, 2000`) and print the result.

## Expected Output
```
875.00
437.50
350.00
```

## Tips
- **Method Overloading:**  
  Create multiple methods with the same name but different parameter lists.
- **Calculations:**  
  Use the given formulas for each method to compute the monthly payment.
- **Printing Results:**  
  In your main method, call each overloaded method and print its return value on a new line.

## Troubleshooting
- Ensure that each overloaded method has a unique parameter list.
- Check that your formulas are correctly implemented and follow the order of operations.
- Verify that your main method correctly creates the object and calls the correct method for each set of inputs.

Happy coding!