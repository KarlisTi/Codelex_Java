package io.codelex.typesandvariables.practice;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Casting {
    public static void main(String[] args) {
        first();
        second();
    }

    private static void first() {
        int a = 1;
        Integer b = 2;
        int c = 3;
        int d = 4;
        int e = 5;

        //fixme - should be 15 :| 
        int sum =a + b + c + d + e;
        System.out.println(sum);
    }

    private static void second() {
        int a= 1;
        Integer b = 2;
        int c = 3;
        double d = 4.2;
        float e = 5.3f;

        //fixme - should be 15.5 :| 
        double sum =a + b + c + d + e;
        BigDecimal newSum = new BigDecimal(sum).setScale(1, RoundingMode.HALF_UP);
        System.out.println(newSum);
    }
}