package io.codelex.Loops;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.print("Input number of terms : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i = 0; i < n; ++i) {
            int newResult = i * i;
            System.out.println(newResult);
        }

    }
}
