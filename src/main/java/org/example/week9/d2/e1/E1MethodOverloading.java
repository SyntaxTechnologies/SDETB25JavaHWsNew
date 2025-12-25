package org.example.week9.d2.e1;

public class E1MethodOverloading {
    public static void main(String[] args){
        LoanPaymentCalculator calc = new LoanPaymentCalculator();

        System.out.printf("%.2f%n", calc.calculatePayment(10000, 5));
        System.out.printf("%.2f%n", calc.calculatePayment(10000, 5, 24));
        System.out.printf("%.2f%n", calc.calculatePayment(10000, 5, 24, 2000));
    }
}

