package org.example.week9.d6.e3;

public class E3Encapsulation {
    public static void main(String[] args){
        Employee emp = new Employee();

        emp.setEmpName("John");
        emp.setEmpAge(30);

        System.out.println("Employee Name: " + emp.getEmpName());
        System.out.println("Employee Age: " + emp.getEmpAge());
    }
}
