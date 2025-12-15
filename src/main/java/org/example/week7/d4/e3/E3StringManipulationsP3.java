package org.example.week7.d4.e3;

public class E3StringManipulationsP3 {
    public static void main(String[] args) {
        String productCode = "KX125";


        char firstChar = productCode.charAt(0);
        boolean startsWithK = (firstChar == 'K');


        char lastChar = productCode.charAt(productCode.length() - 1);
        boolean endsWith5 = (lastChar == '5');


        System.out.println("Product code starts with 'K': " + startsWithK);
        System.out.println("Product code ends with '5': " + endsWith5);





    }
}
