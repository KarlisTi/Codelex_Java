package io.codelex.training.typesandvariables.practice;

import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.println("enter 10 single digits");
        int sumOfNumbers = 0;
        int limitOfDigits = 10;
        int inputNumbers;
        for (int i = 0; i < limitOfDigits; i++) {
            inputNumbers = numbers.nextInt();
            sumOfNumbers += inputNumbers;
            if (inputNumbers > 9) {
                System.out.println("Input single digit numbers");
            }
        }
        System.out.println("Sum of input numbers:" + sumOfNumbers);
    }
}


