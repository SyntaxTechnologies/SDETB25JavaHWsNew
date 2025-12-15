package org.example.week5.d5.e1;

public class E1NestedForLoops {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,  2,  3,  4},
                {5,  6,  7,  8},
                {9, 10, 11, 12}
        };


        for (int row = 0; row < matrix.length; row++) {           // Outer loop (rows)
            for (int col = 0; col < matrix[row].length; col++) {  // Inner loop (columns)
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

    }
}
