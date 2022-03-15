package io.codelex.Loops;

import java.util.Scanner;

public class NumbSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Min?:");
        int min = scan.nextInt();
        System.out.println("Max?:");
        int max = scan.nextInt();

        for(int i = min; i <= max; ++i) {
            System.out.print(i);

            int h;
            for(h = i + 1; h <= max; ++h) {
                System.out.print(h);
            }

            for(h = min; h < i; ++h) {
                System.out.print(h);
            }

            System.out.println();
        }

    }
}
