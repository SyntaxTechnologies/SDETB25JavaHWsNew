package org.example.week5.d3.e4;

public class E4Break {
    public static void main(String[] args) {

        String[] items = {"Item1", "Item2", "Defective", "Item3", "Item4"};


        for (String item : items) {


            if (item.equals("Defective")) {
                System.out.println("Defective item found. Stopping the production line.");
                break;
            }


            System.out.println("Processing " + item);
        }


    }
}
