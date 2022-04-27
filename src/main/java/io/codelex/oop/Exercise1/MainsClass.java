package io.codelex.oop.Exercise1;

public class MainsClass {
    public static void main(String[] args) {
        Rectangle newRect = new Rectangle(4, 6, 6);
        newRect.getArea();
        newRect.getPerimeter();

        Triangle newTriang = new Triangle(3, 5, 5);
        newTriang.getArea();
        newTriang.getPerimeter();
    }
}
