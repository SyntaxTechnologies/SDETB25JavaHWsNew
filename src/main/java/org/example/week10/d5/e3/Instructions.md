# Storing and Retrieving Product Details Using TreeMap

## Objective
Learn how to use a `TreeMap` in Java to store product details with keys that represent realistic product IDs. A TreeMap automatically sorts the entries by key in ascending order.

## Instructions

1. **Initialize a TreeMap**
   - In the existing `E3Map.java` file, initialize a `TreeMap<String, String>` named `productMap`.

2. **Add Product Details**
   - Use the `put()` method to add the following key-value pairs:
      - "A001" → "Apple"
      - "A003" → "Pear"
      - "A002" → "Banana"
      - "A005" → "Mango"
      - "A004" → "Tomato"

3. **Print the Sorted Products**
   - Use a for-each loop to iterate over the entry set of the TreeMap.
   - For each entry, print the key and value in the format:
     ```
     Product ID: [key], Product Name: [value]
     ```

## Expected Output
```
Product ID: A001, Product Name: Apple
Product ID: A002, Product Name: Banana
Product ID: A003, Product Name: Pear
Product ID: A004, Product Name: Tomato
Product ID: A005, Product Name: Mango
```

## Tips
- Use `productMap.put(key, value)` to add entries to the TreeMap.
- A TreeMap automatically sorts its keys in natural (ascending) order.
- Use a for-each loop to iterate over `productMap.entrySet()`:
  ```java
  for (Map.Entry<String, String> entry : productMap.entrySet()) {
      System.out.println("Product ID: " + entry.getKey() + ", Product Name: " + entry.getValue());
  }
  ```

## Troubleshooting
- Ensure you import `java.util.TreeMap` and `java.util.Map` at the top of your file.
- Verify that all key-value pairs are added correctly.
- Check that your for-each loop correctly iterates over all entries in the TreeMap.

Happy coding!