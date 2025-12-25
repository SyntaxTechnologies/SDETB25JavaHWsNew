# Using a Map of List to Organize Related Data

## Objective
Understand the concept of using a `Map` where each key is associated with a `List` of values. This is useful when grouping related data, such as when a single key has multiple values. You will learn how this structure allows for efficient data organization, especially when you need to map one key to multiple entries.

### Real-Life Use Cases:

1. **Group Students by Subjects:** Use a `Map<String, List<String>>` to group students based on the subjects they have enrolled in, where each subject can have multiple students.
2. **Organize Products by Categories:** Use a `Map<String, List<String>>` to group products by their category, such as electronics, clothing, etc.

## Instructions

**Scenario 1: Group Students by Subjects**

1. **Create a `Map` to Store Students Grouped by Subject:**
   - **Task:** You need to group students based on the subject they are studying. Each subject will have a list of students, so use a `Map<String, List<String>>` where the key is the subject, and the value is a list of students.
   - **Initialize a `Map<String, List<String>>`** to store the subject (key) and the list of students (value).
   - Add the following data:
      - `"Mathematics"` = `["Alice", "Bob"]`
      - `"Science"` = `["Charlie", "David"]`
      - `"History"` = `["Eve", "Frank"]`
   - **Output:** Print the subjects and the corresponding list of students.
   - **Expected Result:** Each subject will have its list of students printed together.


## Task 1: Create Maps and Add Data

**Step 1: Create the `E6Map.java` class with the following**:
1.  **HashMap Initialization:**
     - Initialize a HashMap<String, List<String>> where the key represents the  Subject and the value List of Students.

**Step 2: Add Data to the HashMap**

1. **Add the following Students Grouped by Subject into HashMap**:
    - Add `"Mathematics"` = `["Alice", "Bob"]`, `"Science"` = `["Charlie", "David"]`, `"History"` = `["Eve", "Frank"]`.
       
**Step 3: Print the contents of each map** using a loop, and observe how the data is organized into lists for each key.

1. **Use a for-each loop** to iterate through the entries of the `TreeMap` and print each key-value pair in the format:`Subject: [key] Students: [value]`.

## Example Output:

```plaintext
From Map (Students by Subject):
Subject: Mathematics Students: [Alice, Bob]
Subject: Science Students: [Charlie, David]
Subject: History Students: [Eve, Frank]
```
### Key Points:
Map of List: Best when you need to group multiple related values under a single key.
Easy Access: Allows efficient retrieval and manipulation of grouped data.
Happy coding!
