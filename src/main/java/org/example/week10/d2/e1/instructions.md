# Filtering a LinkedList Using Lambda Expressions

## Objective
Learn how to use a `LinkedList` in Java to store numbers, filter them using lambda expressions, and print the filtered list. You will add integers from 50 to 100 to the list, remove all numbers that are not divisible by 3 using a lambda, and then print the remaining elements.

## Instructions

1. **Create a LinkedList of Integers**
   - In the existing `E1LinkedList.java` file, initialize a `LinkedList<Integer>`.

2. **Add Elements to the LinkedList**
   - Use a loop to add each integer from 50 to 100 (inclusive) to the linked list.

3. **Filter the LinkedList**
   - Use the `removeIf()` method with a lambda expression to remove all numbers that are not divisible by 3.
      - The lambda condition should be: `num -> num % 3 != 0`

4. **Print the Filtered List**
   - After filtering, print the entire LinkedList. The output should display only the numbers divisible by 3.

## Expected Output
```
[51, 54, 57, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99]
```

## Tips
- Use `LinkedList<Integer> numbers = new LinkedList<>();` to initialize your list.
- Use a for loop to add numbers from 50 to 100, for example:
- Use the `removeIf()` method with a lambda expression:
- Finally, print the list using `System.out.println(numbers);`

## Troubleshooting
- Ensure you import `java.util.LinkedList;`.
- Check that your loop correctly adds all numbers from 50 to 100.
- Verify that your lambda correctly filters out numbers not divisible by 3.

Happy coding!