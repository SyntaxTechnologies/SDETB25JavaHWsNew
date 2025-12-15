package org.example.week5.d3.e1;

public class E1EnhancedForLoop {
    public static void main(String[] args) {

        int[] years = new int[11];


        int startYear = 2025;
        for (int i = 0; i < years.length; i++) {
            years[i] = startYear + i;
        }


        for (int year : years) {
            System.out.println(year);
        }
    }
}
