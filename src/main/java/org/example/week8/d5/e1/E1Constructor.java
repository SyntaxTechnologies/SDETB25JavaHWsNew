package org.example.week8.d5.e1;

public class E1Constructor {
    public static void main(String[] args) {



        //   Create an object of SyntaxTechnologies using the non-argument constructor.
        //   Create another object using the parameterized constructor (pass values).
        //   Call the display() method on both objects.
        //5. Expected Output
        //   For the Non-Argument Constructor
        //   null 0 0 null
        //   For the Parameterized Constructor
        //   Syntax 6 2020 07302020


        SyntaxTechnologies obj1 = new SyntaxTechnologies();
        obj1.display();

        SyntaxTechnologies obj2 =
                new SyntaxTechnologies("Syntax", 6, 2020, "07302020");
        obj2.display();


    }
}
