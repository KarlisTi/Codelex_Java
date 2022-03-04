package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type height in inches");
        double height = scan.nextDouble();
        System.out.println("Type weight in pounds");
        double weight = scan.nextDouble();
        double BMI = weight * 703/ Math.pow(height,2);
        if(BMI<18.5){
            System.out.println("Person is consider underweight");
        } else if(BMI>25){
            System.out.println("Person is consider overweight");
        } else {
            System.out.println("Person weight is fine");
        }
    }
}