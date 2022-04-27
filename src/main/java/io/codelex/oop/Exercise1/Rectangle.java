package io.codelex.oop.Exercise1;

import java.math.BigDecimal;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(int numberOfSides, double width, double height) {
        super(numberOfSides);
        this.width = width;
        this.height = height;
    }

    @Override
    void getArea() {
        System.out.println(this.height * this.width);

    }

    @Override
    void getPerimeter() {
        System.out.println(2 * (this.height + this.width));
    }
}
