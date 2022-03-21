package io.codelex.oop.Exercise9;

public class Hexagon extends Shape {

    private int sideLength;

    public Hexagon(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    void calculatePerimeter() {
        System.out.println(this.sideLength * 6);
    }

    @Override
    void calculateArea() {
        System.out.println((3 * Math.sqrt(3) * this.sideLength) / 2);
    }

    @Override
    void calculateVolume() {

    }
}
