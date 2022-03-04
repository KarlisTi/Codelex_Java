package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input first number:");
        int inputIntegerOne = scan.nextInt();
        System.out.println("Input second number:");
        double inputIntegerTwo = scan.nextInt();
        if (inputIntegerOne == 15 || inputIntegerTwo == 15) {
            System.out.println(true);
        } else if (inputIntegerOne + inputIntegerTwo == 15) {
            System.out.println(true);
        } else if (inputIntegerOne - inputIntegerTwo == 15) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

