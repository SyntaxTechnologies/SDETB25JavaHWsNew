package org.example.week9.d4.e2;

public class E2PolyMorphism {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[] {
                new Circle(5),
                new Rectangle(4, 6)
        };

        for (int i = 0; i < shapes.length; i++) {
            System.out.printf("%.2f%n", shapes[i].calculateArea());
        }

    }
}
