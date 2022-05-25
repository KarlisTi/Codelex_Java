package io.codelex.oop.Exercise9and10;

public class mainClass {
    public static void main(String[] args) {

        Triangle newTriangle = new Triangle(6, 11);
        newTriangle.calculateArea();
        newTriangle.calculatePerimeter();

        Rectangle newRectangle = new Rectangle(6, 6);
        newRectangle.calculatePerimeter();
        newRectangle.calculateArea();

        Hexagon newHexagon = new Hexagon(6);
        newHexagon.calculateArea();
        newHexagon.calculatePerimeter();

        Cube newCube = new Cube(6, 6, 6);
        newCube.calculateVolume();

        Cone newCone = new Cone(6, 6);
        newCone.calculateVolume();

    }
}