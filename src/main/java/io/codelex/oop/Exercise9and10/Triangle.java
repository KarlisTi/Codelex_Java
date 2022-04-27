package io.codelex.oop.Exercise9and10;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Triangle extends Shape {

    private double width;
    private double height;

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    void calculatePerimeter() {
        Double value = Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height, 2));
        double perimeter = value + this.height + this.width;
        BigDecimal newBig = new BigDecimal(perimeter).setScale(2, RoundingMode.HALF_UP);
        System.out.println("Triangle perimeter is " + newBig);

    }

    @Override
    void calculateArea() {
        System.out.println("Triangle are is " + (this.width * this.height) / 2);
    }


}
