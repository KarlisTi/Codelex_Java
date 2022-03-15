package io.codelex.Loops;

import java.util.Random;
import java.util.Scanner;

public class Piglet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Piglet!");
        Random random = new Random();
        int randomNumber = random.nextInt(6) + 1;
        int totals = 0;
        System.out.println("You rolled a:" + randomNumber);

        while (randomNumber != 1) {
            System.out.println("Roll again?");
            String newInput = scan.next().toLowerCase();
            if (!newInput.equals("yes")) {
                System.out.println("You got:" + totals + " points");
                break;
            }

            int newRandomNumber = random.nextInt(6) + 1;
            System.out.println("You rolled:" + newRandomNumber);
            totals += newRandomNumber;
        }

        if (randomNumber == 1) {
            System.out.println("You got 0 points");
        }

    }
}
