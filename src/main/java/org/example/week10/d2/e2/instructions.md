# Managing Employee Ages with LinkedList - Filtering, Sorting, and Averaging

## Objective
Learn how to use a `LinkedList` in Java to manage employee ages by filtering, sorting, and calculating the average age. In this exercise, you will store a fixed set of employee ages, remove those that fall outside a specified range, sort the remaining ages in ascending order, and calculate the average.

## Instructions

1. **Create a LinkedList of Employee Ages**
   - In the existing `E2LinkedList.java` class, initialize a `LinkedList<Integer>` to store employee ages.
   - Manually add the following 10 employee ages to the list:  
     `60, 30, 35, 70, 45, 50, 55, 22, 65, 40`

2. **Filter the Ages**
   - Remove any ages that are not between 25 and 60 (inclusive). This will remove 22, 65, and 70.
   - After filtering, the list should contain:  
     `[30, 35, 40, 45, 50, 55, 60]`

3. **Sort the Ages**
   - Use `Collections.sort()` to sort the filtered ages in ascending order.

4. **Calculate and Print the Average Age**
   - Iterate through the sorted list to calculate the sum of the remaining ages.
   - Compute the average by dividing the sum by the number of remaining ages.
   - Print the sorted list and the average age.

## Expected Output
```
Remaining ages: [30, 35, 40, 45, 50, 55, 60]
Average age: 45.0
```

## Tips
- **LinkedList Operations:**  
  Use the `add()` method to insert ages and `removeIf()` to filter out ages outside the range 25 to 60.
- **Sorting:**  
  Use `Collections.sort(linkedList)` to sort the list. This ensures the ages are in ascending order.
- **Average Calculation:**  
  Sum the ages using a loop, then divide by the number of elements to find the average.
- **Real-World Example:**  
  This exercise simulates managing employee age data for reporting purposes in a company.

## Troubleshooting
- Ensure you import `java.util.LinkedList` and `java.util.Collections`.
- Verify that you add all 10 ages to the list before filtering.
- Check that your filtering condition correctly removes ages less than 25 and greater than 60.
- Make sure your loop correctly calculates the sum and average of the remaining ages.

Happy coding!