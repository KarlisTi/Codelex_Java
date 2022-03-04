package io.codelex.arithmetic.practice;

public class CozaLozaWoza {
    public static void main(String[] args) {
        int counter = 1;
        for (int c = 1; c <=10; c++) {
            for (int j = 1; j <12; j++) {
                if (counter % 3 == 0 && counter % 5 == 0) {
                    System.out.print("CozaLoza");
                } else if (counter % 3 == 0 && counter % 7 == 0) {
                    System.out.print("CozaWoza");
                } else if (counter % 3 == 0) {
                    System.out.print("Coza");
                } else if (counter % 5 == 0) {
                    System.out.print("Loza");
                } else if (counter % 7 == 0) {
                    System.out.print("Woza");
                } else {
                    System.out.print(counter);
                }
                System.out.print(" ");
                counter++;
            }
            System.out.println();
        }

    }
}
