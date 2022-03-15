package io.codelex.Loops;

import java.util.Random;
import java.util.Scanner;

public class RollTwoDice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Desired sum:");
        int desiredSum = scan.nextInt();
        int total = 0;

        while(desiredSum != total) {
            int diceNumberOne = random.nextInt(6) + 1;
            int diceNumberTwo = random.nextInt(6) + 1;
            total = diceNumberOne + diceNumberTwo;
            System.out.println(diceNumberOne + " and " + diceNumberTwo + " = " + total);
        }

    }
}
