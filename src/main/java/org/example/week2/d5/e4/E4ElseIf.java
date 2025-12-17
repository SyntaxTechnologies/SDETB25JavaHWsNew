package org.example.week2.d5.e4;

public class E4ElseIf {
    public static void main(String[] args) {

        String animal= "dog";
        if (animal.equals("dog")){
            System.out.println("The animal is a mammal");

        } else if (animal.equals("eagle")) {
            System.out.println("animal is a bird");
            
        }else if (animal.equals("shark")) {
            System.out.println("The animal is a fish.");
        } else if (animal.equals("frog")) {
            System.out.println("The animal is an amphibian.");
        } else if (animal.equals("snake")) {
            System.out.println("The animal is a reptile.");
        } else {
            System.out.println("Unknown animal type.");
        }


    }
}