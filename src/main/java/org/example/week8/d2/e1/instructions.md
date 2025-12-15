# Declaring and Accessing Instance Variables

## Objective
Learn how to declare and access instance variables in Java by creating a class that holds information about a student, and by creating two instances of that class.

## Instructions

1. **Declare Instance Variables**
    - Inside the `Student` class (but outside any methods), declare three instance variables:
        - An `int` variable named `year`
        - A `String` variable named `schoolName`
        - An `int` variable named `batchNumber`

2. **Assign Values to Instance Variables**
    - In the `main` method (within `E1Variables`), create **two instances** of the `Student` class.
    - For the **first instance**, assign the following values:
        - `year` = 2050
        - `schoolName` = "Syntax"
        - `batchNumber` = 200
    - For the **second instance**, assign the following values:
        - `year` = 2051
        - `schoolName` = "Tech"
        - `batchNumber` = 300

3. **Print the Values**
    - Print the instance variable values for each student using the following format:
      ```
      I am a student of batch 200 studying at Syntax in the year of 2050.
      I am a student of batch 300 studying at Tech in the year of 2051.
      ```

## Expected Output
```
I am a student of batch 200 studying at Syntax in the year of 2050.
I am a student of batch 300 studying at Tech in the year of 2051.
```

## Tips
- **Declaration:**  
  Declare the instance variables at the class level (outside any methods) so they are accessible by all methods in the class.
- **Accessing Variables:**  
  Use dot notation (e.g., `student.year`) to access or modify instance variables.
- **Creating Multiple Instances:**  
  In your `main` method, create two separate objects of the `Student` class and assign values to each object independently.
- **Printing:**  
  Use `System.out.println` to print each student's details in the specified format.

## Troubleshooting
- Ensure that your instance variables are declared at the class level.
- Verify that you create two objects of the `Student` class before assigning values.
- Check that you use the correct data types for each variable.

Happy coding!