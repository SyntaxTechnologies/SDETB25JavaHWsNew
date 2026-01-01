package org.example.week4.d4.e7;

import java.util.Scanner;

public class E7ForLoop {
    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);

        System.out.print("In: ");
        int x = scan.nextInt();

        for (int i = 0; i < x; i++) {
            System.out.print(i + " ");
        }

        scan.close();
    }
}
