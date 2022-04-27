package io.codelex.oop.Exercise2;


public class MainClass {
    public static void main(String[] args) {
        Employee newEmployee = new Employee("Janis", "Ozols", "Seller", "2012-01-02");
        System.out.println(newEmployee.getInfo());
        Customer newCustomer = new Customer("Anna", "Lapa", "SICDG232", 12);
        System.out.println(newCustomer.getInfo());


    }
}

