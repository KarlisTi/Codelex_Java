package io.codelex.oop.Exercise9;

import java.math.BigDecimal;

public class Triangle extends Shape {

    private double width;
    private double height;

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    void calculatePerimeter() {
        double c = Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height, 2));
        double perimeter = c + this.height + this.width;
        BigDecimal newBig = new BigDecimal(perimeter).setScale(2, BigDecimal.ROUND_UP);
        System.out.println(newBig);
    }

    @Override
    void calculateArea() {
        System.out.println(0.5 * this.height * this.width);
    }

    @Override
    void calculateVolume() {

    }
}
