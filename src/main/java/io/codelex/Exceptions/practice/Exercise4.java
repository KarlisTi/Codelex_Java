package io.codelex.Exceptions.practice;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            double d = getInput(args[0]);
            double root = Math.sqrt(d);
            System.out.println(
                    "The square root of " + d + " is " + root);
        } catch (NumberFormatException e) {
            System.out.println("Be sure to enter a number.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter number as first parameter.");
        }
        // catch (NonPositiveNumberException e) {
        System.out.println("Result will be imaginary number.");
    }


    static double getInput(String s) {
        double d = new Double(s).doubleValue();
        try {
            if (d < 0) {
                throw new IllegalArgumentException("Enter a postive number");
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        return d;
    }
}
