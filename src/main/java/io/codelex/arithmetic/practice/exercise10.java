package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class exercise10 {
    public static double circleArea(double r) {
        if (r < 0) {
            System.out.println("Negative number is not allowed");
        }
        return Math.round( Math.PI * r);

    }

    public static double rectangle(double length, double width) {
        if (length < 0 || width < 0) {
            System.out.println("Negative number is not allowed");
        }
        return length * width;
    }

    public static double triangle(double base, double height) {
        if (base < 0 || height < 0) {
            System.out.println("Negative number is not allowed");
        }
        return base * height * 0.5;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Geometry calculator:\n" +
                "\n" +
                "1.Calculate the Area of a Circle\n" +
                "2.Calculate the Area of a Rectangle\n" +
                "3.Calculate the Area of a Triangle\n" +
                "4.Quit\n" +
                "Enter your choice (1-4):\n" +
                "```");
        int chooseNumber = scan.nextInt();
        if (chooseNumber == 1) {
            System.out.println("Calculate the Area of a Circle");
            System.out.println("Enter radius of circle");
            double radius = scan.nextDouble();
            System.out.println(circleArea(radius));
        } else if (chooseNumber == 2) {
            System.out.println("Calculate the Area of a Rectangle");
            System.out.println("Enter rectangle length");
            double length = scan.nextDouble();
            System.out.println("Enter rectangle width");
            double width = scan.nextDouble();
            System.out.println(rectangle(length, width));
        } else if (chooseNumber == 3) {
            System.out.println("Calculate the Area of a Triangle");
            System.out.println("Enter triangle base");
            double base = scan.nextDouble();
            System.out.println("Enter triangle height");
            double height = scan.nextDouble();
            System.out.println(triangle(base, height));
        } else if(chooseNumber ==4) {
            System.out.println("quit");
        }
    }
}
