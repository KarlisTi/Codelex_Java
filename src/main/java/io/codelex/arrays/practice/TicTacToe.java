package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {
    private static char[][] board = new char[3][3];

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println();
        initBoard();
        displayBoard();
        int chances =9;
        for (int i = 0; i < chances; i++) {

            System.out.println("1. spēlētāja gājiens:");
            System.out.println("Kur liksi O?");

            int inputX = keyboard.nextInt();
            int inputY = keyboard.nextInt();
            board[inputX][inputY] = 'O';
            displayBoard();
           if(gameWinner(board) =='O'){
               System.out.println("Uzvar 1. spēlētājs");
               break;
           }


            System.out.println("2. spēlētāja gājiens:");
            System.out.println("Kur liksi X?");

            int inputX1 = keyboard.nextInt();
            int inputY1 = keyboard.nextInt();

            board[inputX1][inputY1] = 'X';
            displayBoard();
            if(gameWinner(board) =='X'){
                System.out.println("Uzvar 2. spēlētājs");
                break;
            }
        }
    }

    public static char gameWinner(char[][] board) {
        for(int i = 0; i < 3; i++) {
            if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
                return board[i][0];
            }
        }
        for(int j = 0; j < 3; j++) {
            if(board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != ' ') {
                return board[0][j];
            }
        }

        if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {
            return board[0][0];
        }
        if(board[2][0] == board[1][1] && board[1][1] ==  board[0][2] && board[2][0] != ' ') {
            return board[2][0];
        }
        return ' ';

    }

    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }


    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }
}
