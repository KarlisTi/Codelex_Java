package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {
    private static char[][] board = new char[3][3];

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println();
        initBoard();
        displayBoard();

        for (int i = 0; i < 9; i++) {

            System.out.println("1. spēlētāja gājiens:");
            System.out.println("Kur liksi O?");

            int x = keyboard.nextInt();
            int y = keyboard.nextInt();
            board[x][y] = 'O';
            gameWinner(board);
            displayBoard();

            System.out.println("2. spēlētāja gājiens:");
            System.out.println("Kur liksi X?");

            int x1 = keyboard.nextInt();
            int y1 = keyboard.nextInt();

            board[x1][y1] = 'X';
            displayBoard();
            boolean playerOne;
            boolean playerTwo;
            boolean gameIsTie
        }
    }

    public static boolean gameWinner(char[][]board) {
        ;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'O'}{

            }
        }
        return false;
    }


        public static void initBoard () {
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
