package org.example.week5.d5.e1;

public class E1NestedForLoops {
    public static void main(String[] args) {
        int[][] numbers = {
                {1,  2,  3,  4},
                {5,  6,  7,  8},
                {9, 10, 11, 12}
        };

        // 2 & 3. Use nested loops to traverse and print each element in matrix form
        for (int row = 0; row < numbers.length; row++) {              // outer loop: rows
            for (int col = 0; col < numbers[row].length; col++) {     // inner loop: columns
                System.out.print(numbers[row][col] + " ");
            }
            System.out.println(); // move to next line after each row
        }

    }
}
