package io.codelex.Loops;

import java.util.Scanner;

public class ASCIIFigure {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input size of figure");
        int classConstant = scan.nextInt();
        int value = classConstant * 4;
        int symbolValue = 4;
        int newSymbolValue = 8;

        for (char i = 1; i <= classConstant; ++i) {
            char h;
            for (h = 1; h <= value - symbolValue * i; ++h) {
                System.out.print('/');
            }

            for (h = 1; h <=newSymbolValue * i - newSymbolValue; ++h) {
                System.out.print('*');
            }

            for (h = 1; h <= value - symbolValu * i; ++h) {
                System.out.print('\\');
            }

            System.out.println();
        }

    }
}

