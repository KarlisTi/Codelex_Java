package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a number");
        int inputNumber = scan.nextInt();
        if(inputNumber %2 ==0){
            System.out.println("Even number");
        } else{
            System.out.println("Odd number");
        }
        System.out.println("Bye");
    }
}
