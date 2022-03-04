package io.codelex.arithmetic.practice;

import java.util.Random;
import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int minNumber = 1;
        int maxNumber = 100;
        Random r = new Random();
        int randomNumber = (int) (Math.random() * (maxNumber - minNumber) + minNumber);
        System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
        int inputNumber = scan.nextInt();
        if (inputNumber > randomNumber) {
            System.out.println("Sorry, you are too high.  I was thinking of " + randomNumber);
        } else if (inputNumber < randomNumber) {
            System.out.println("Sorry, you are too low.  I was thinking of " + randomNumber);
        } else{
            System.out.println("You guessed it!  What are the odds?!?");
        }

    }
}
