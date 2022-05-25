package io.codelex.oop.Exercise9and10;

public class Rectangle extends Shape {

    private int width;
    private int height;


    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    void calculatePerimeter() {
        int value = (this.width * 2) + (this.height * 2);
        System.out.println("Rectangle perimeter is " + value);
    }

    @Override
    void calculateArea() {
        System.out.println("Rectangle are is " + this.height * this.width);
    }
}
