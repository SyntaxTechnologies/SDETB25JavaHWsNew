package org.example.week4.d4.e8;

import java.util.Scanner;

public class E8ForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("In: ");
        int x = input.nextInt();


        for (int i = x - 1; i >= 0; i--) {
            System.out.print(i + " ");
        }


        input.close();


    }
}
