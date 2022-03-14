package io.codelex.oop.Exercise1;

import javax.swing.*;
import java.math.BigDecimal;

public class Triangle extends Shape {

    private double width;
    private double height;

    public Triangle(int numberOfSides, double width, double height) {
        super(numberOfSides);
        this.width = width;
        this.height = height;
    }

    @Override
    void getArea() {
        System.out.println((this.width * this.height) / 2);

    }

    @Override
    void getPerimeter() {
        double c = Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height, 2));
        double perimeter = c + this.height + this.width;
        BigDecimal newBig = new BigDecimal(perimeter).setScale(2, BigDecimal.ROUND_UP);
        System.out.println(newBig);
    }
}