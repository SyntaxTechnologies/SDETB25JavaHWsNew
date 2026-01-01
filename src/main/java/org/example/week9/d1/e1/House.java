package org.example.week9.d1.e1;

public class House extends Building {
    /*
     * 1. Create a constructor that takes a String parameter (location).
     * 2. Inside the House constructor, call the parent class's parameterized constructor using:
     *      super(location);
     * 3. This ensures that the Building part of the object is properly initialized.
     */

    public House(String location) {
        super(location); // MUST be first
    }
}
