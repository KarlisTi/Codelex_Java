package io.codelex.oop.Exercise9;

import java.math.BigDecimal;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(int width, int heigth) {
        this.width = width;
        this.height = heigth;
    }

    @Override
    void calculatePerimeter() {
        System.out.println(2 * (this.height + this.width));

    }

    @Override
    void calculateArea() {
        System.out.println(this.height * this.width);
    }
}
