package org.example.week4.d5.e1;

public class E1Array {
    public static void main(String[] args) {


        int[]num=new int[5];
        num[0]=45;
        num[1]=78;
        num[2]=12;
        num[3]=67;
        num[4]=55;

        int size=num.length;


        for (int i=0; i<size; i++){
            System.out.print(num[i]+" ");
        }
    }
}
