package org.example.week8.d4.e1;

public class E1AccessModifiers {

    private void privateMethod() {
        System.out.println("This is Private Method");
    }

    void defaultMethod() { // default (package-private)
        System.out.println("This is Default Method");
    }

    public void publicMethod() {
        System.out.println("This is Public Method");
    }
    public static void main(String[] args) {
        E1AccessModifiers obj = new E1AccessModifiers();
        obj.privateMethod();
        obj.defaultMethod();
        obj.publicMethod();

    }
}


