package io.codelex.classesandobjects.practice;

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
        System.out.println(a + ", " + b + " EUR," + c + "units");
    }

    public static void main(String[] args) {
        Product.printProduct("Logitech mouse", 70.00, 14);
        Product.printProduct("iPhone 5s", 999.99, 3);
        Product.printProduct("Epson EB-U05", 440.46, 1);

    }
}



