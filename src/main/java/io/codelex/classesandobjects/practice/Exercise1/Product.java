package io.codelex.classesandobjects.practice.Exercise1;


public class Product {
    private String name;
    private double priceAtStart;
    private int amountAtStart;

    public Product(String name, double priceAtStart, int amountAtStart) {
        this.name = name;
        this.priceAtStart = priceAtStart;
        this.amountAtStart = amountAtStart;
    }

    public static void printProduct(String a, double b, int c) {
        System.out.println(a + ", " + b + " EUR," + c + " units");
    }
}

