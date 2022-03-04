package io.codelex.Loops;

import java.util.Scanner;

public class ASCIIFigure {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input size of figure");
        int classConstant = scan.nextInt();
        int value = classConstant * 4;

        for (char i = 1; i <= classConstant; ++i) {
            char h;
            for (h = 1; h <= value - 4 * i; ++h) {
                System.out.print('/');
            }

            for (h = 1; h <= 8 * i - 8; ++h) {
                System.out.print('*');
            }

            for (h = 1; h <= value - 4 * i; ++h) {
                System.out.print('\\');
            }

            System.out.println();
        }

    }
}

