package io.codelex.oop.Exercise1;

import java.math.BigDecimal;

public abstract class Shape {

    private int numberOfSides;

    public Shape(int numberOfSides) {
        this.numberOfSides = numberOfSides;

    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    abstract void getArea();


    abstract void getPerimeter();

}
