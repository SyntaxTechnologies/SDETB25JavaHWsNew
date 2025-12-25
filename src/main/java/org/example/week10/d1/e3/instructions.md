# Managing Product Order Quantities Using an ArrayList

## Objective
Learn how to use an ArrayList in Java to manage and print the quantities of a single product's orders in an e-commerce system.

## Instructions

1. **Create an ArrayList for Order Quantities**
    - In the existing `E3ArrayList.java` class, initialize an `ArrayList<Integer>` to store the quantities of orders for a product (e.g., a product called "Widget").

2. **Add Order Quantities**
    - Add several different order quantities to the ArrayList. For example, add the numbers: 10, 20, 15, 30, 25.
    - These numbers represent the quantities ordered in each order.

3. **Print Order Quantities**
    - Use a loop (for example, a normal for loop) to iterate over the ArrayList.
    - Print each order quantity on a separate line.

## Expected Output
```
10
20
15
30
25
```

## Tips
- Use `ArrayList<Integer> orders = new ArrayList<>();` to create your list.
- Use the `add()` method to add each order quantity to the ArrayList.
- Use a for loop to iterate over the ArrayList and print each element with `System.out.println()`.

## Troubleshooting
- Ensure that you import `java.util.ArrayList;` at the top of your file.
- Check that you use the correct method (`add()`) to insert elements into the ArrayList.
- Verify that your loop correctly iterates over all elements in the ArrayList.

Happy coding!