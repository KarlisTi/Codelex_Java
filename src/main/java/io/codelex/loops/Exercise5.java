package io.codelex.Loops;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word");
        String firstWord = scan.next();
        System.out.println("Enter second word");
        String secondWord = scan.next();
        int firsStringLength = firstWord.length();
        int secondStringLength = secondWord.length();
        int calculateDots = 30 - firsStringLength - secondStringLength;
        System.out.println(calculateDots);
        String dots = "";

        for(int i = 0; i < calculateDots; ++i) {
            dots = dots + ".";
        }

        System.out.println(firstWord + dots + secondWord);
    }
}
