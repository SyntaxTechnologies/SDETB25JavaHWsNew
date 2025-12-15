package org.example.week3.d4.e1;

public class E1LogicalOperators {
    public static void main(String[] args) {
        boolean needsLoan = true;
        int creditScore = 750;

        if (needsLoan && creditScore >= 700) {
            System.out.println("The eligibility is Eligible");
        } else {
            System.out.println("The eligibility is Not eligible");
        }


    }
}
