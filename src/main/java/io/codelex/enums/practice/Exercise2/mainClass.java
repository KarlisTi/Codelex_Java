package io.codelex.enums.practice.Exercise2;

import java.util.Random;
import java.util.Scanner;

public class mainClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Let us begin");
        boolean runningGame = true;
        while (runningGame) {
            System.out.println("Scissor-Paper-Stone");
            System.out.println("Your turn (Enter s for scissor, p for paper, t for stone, q to quit)");
            char playerChoice = scan.nextLine().toUpperCase().charAt(0);
            ScissorPaperStone playerOneValue = playerOne(playerChoice);

            if (playerChoice == 'Q') {
                runningGame = false;
                System.out.println("You quited game");
            } else if (playerChoice != 'S' && playerChoice != 'T' && playerChoice != 'P') {
                System.out.println("Invalid input!");
            }
            System.out.print("My turn: ");
            ScissorPaperStone playerTwoValue = playerMyturn();
            System.out.println(playerTwoValue);
            Winner(playerOneValue, playerTwoValue);
        }
    }

    public static ScissorPaperStone playerOne(char playerChoice) {
        ScissorPaperStone value = ScissorPaperStone.STONE;
        switch (playerChoice) {
            case 'T':
                value = ScissorPaperStone.STONE;
                break;
            case 'P':
                value = ScissorPaperStone.PAPER;
                break;
            case 'S':
                value = ScissorPaperStone.SCISSOR;
                break;
        }
        return value;
    }

    public static ScissorPaperStone playerMyturn() {
        return ScissorPaperStone.values()[new Random().nextInt(ScissorPaperStone.values().length)];
    }

    public static void Winner(ScissorPaperStone playerOne, ScissorPaperStone playerTwo) {

        if (playerOne == ScissorPaperStone.STONE && playerTwo == ScissorPaperStone.SCISSOR) {
            System.out.println("Stone breaks scissor, You won!");
        } else if (playerOne == ScissorPaperStone.PAPER && playerTwo == ScissorPaperStone.STONE) {
            System.out.println("You won!");
        } else if (playerOne == ScissorPaperStone.SCISSOR && playerTwo == ScissorPaperStone.PAPER) {
            System.out.println("Scissor cuts paper, You won!");
        } else if (playerOne == ScissorPaperStone.PAPER && playerTwo == ScissorPaperStone.SCISSOR) {
            System.out.println("Scissor cuts paper, I won!");
        } else if (playerOne == ScissorPaperStone.SCISSOR && playerTwo == ScissorPaperStone.STONE) {
            System.out.println(" I won!");
        } else if (playerOne == ScissorPaperStone.STONE && playerTwo == ScissorPaperStone.PAPER) {
            System.out.println("I won!");
        } else {
            System.out.println("Game is a tie");
        }
    }
}
