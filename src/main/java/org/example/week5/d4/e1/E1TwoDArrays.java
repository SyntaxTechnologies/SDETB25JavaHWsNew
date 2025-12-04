package org.example.week5.d4.e1;

public class E1TwoDArrays {
    public static void main(String[] args) {

        int[][] a = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(a[0][0] + " " + a[0][1] + " " + a[0][2]);
        System.out.println(a[1][0] + " " + a[1][1] + " " + a[1][2]);
        System.out.println(a[2][0] + " " + a[2][1] + " " + a[2][2]);



        for (int i = 0; i< a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j]+" ");
            }

            System.out.println();
        }


    }
}
