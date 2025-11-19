package org.example.week2.d3.e3;

public class E3CompoundOperators {
    public static void main(String[] args) {

        // Create Variables
        int addOp = 10;
        int subOp = 20;
        int mulOp = 5;
        int divOp = 40;
        int modOp = 17;

        // Use Compound Operators and Print Results

        // += : add 5 to addOp
        addOp += 5;  // 10 + 5 = 15
        System.out.println(addOp);

        // -= : subtract 3 from subOp
        subOp -= 3;  // 20 - 3 = 17
        System.out.println(subOp);

        // *= : multiply mulOp by 3
        mulOp *= 3;  // 5 * 3 = 15
        System.out.println(mulOp);

        // /= : divide divOp by 5
        divOp /= 5;  // 40 / 5 = 8
        System.out.println(divOp);

        // %= : remainder of modOp divided by 5
        modOp %= 5;  // 17 % 5 = 2
        System.out.println(modOp);
    }
}
