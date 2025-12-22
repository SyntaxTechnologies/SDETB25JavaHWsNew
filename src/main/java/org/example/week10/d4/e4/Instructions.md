# Managing Address Details with LinkedHashMap

## Objective
Learn how to use a `LinkedHashMap` in Java to store address details and perform simple operations like adding entries, checking size, verifying if the map is empty, retrieving a value by key, and clearing the map.

## Instructions

1. **Initialize a LinkedHashMap**
   - In the existing `E1Map.java` class, initialize a `LinkedHashMap<String, String>` named `addressMap`.

2. **Add Address Details**
   - Use the `put()` method to add the following key-value pairs to `addressMap`:
      - "Street" → "Patrick ST"
      - "Suite" → "265"
      - "City" → "Vienna"
      - "Zip" → "22180"
      - "Country" → "United States"

3. **Display Map Information**
   - Print the size of the map using `size()`.
   - Print whether the map is empty using `isEmpty()`.
   - Retrieve and print the value for the key "City" using `get()`.

4. **Clear the Map and Verify**
   - Use the `clear()` method to remove all entries from the map.
   - Print whether the map is empty after clearing it.

## Expected Output
```
Size: 5
Is map empty? false
City: Vienna
After clearing, is map empty? true
```

## Tips
- Use `addressMap.put(key, value)` to add entries.
- Use `addressMap.size()` to get the number of entries.
- Use `addressMap.isEmpty()` to check if the map is empty.
- Use `addressMap.get("City")` to retrieve the value for the key "City".
- Use `addressMap.clear()` to remove all entries from the map.

## Troubleshooting
- Ensure you import `java.util.LinkedHashMap;` at the top of your file.
- Verify that all key-value pairs are added correctly.
- Check that you call the methods in the proper order (add, display, then clear).

Happy coding!