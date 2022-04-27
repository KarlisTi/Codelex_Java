//package io.codelex.oop.Exercise9and10;
//
//import java.math.BigDecimal;
//import java.math.RoundingMode;
//
//public class Cone extends Shape3D {
//
//    private int height;
//    private int radius;
//
//    public Cone(int height, int radius) {
//        this.height = height;
//        this.radius = radius;
//    }
//
//    @Override
//    void calculateVolume() {
//        Double value = Math.PI * Math.pow(this.radius, 2) * this.height / 3;
//        BigDecimal cone = new BigDecimal(value).setScale(2, RoundingMode.HALF_UP);
//        System.out.println("Cone volume is " + cone);
//
//    }
//
//    @Override
//    void calculatePerimeter() {
//
//    }
//
//    @Override
//    void calculateArea() {
//
//    }
//}
