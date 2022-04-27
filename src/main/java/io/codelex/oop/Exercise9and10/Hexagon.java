package io.codelex.oop.Exercise9and10;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Hexagon extends Shape {

    private int sideLength;

    public Hexagon(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    void calculatePerimeter() {
        System.out.println("Hexagon perimeter is " + this.sideLength * 6);
    }

    @Override
    void calculateArea() {
        Double value = (3 * Math.sqrt(3) * this.sideLength) / 2;
        BigDecimal newValue = new BigDecimal(value).setScale(2, RoundingMode.HALF_UP);
        System.out.println("Hexagon area is " + (newValue));
    }


}
