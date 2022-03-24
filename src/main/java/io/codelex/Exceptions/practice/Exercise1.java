package io.codelex.Exceptions.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the numerator");
            String numerator = scanner.next();
            System.out.println("Enter the divisor");
            int divisor = scanner.nextInt();
            int result;

            try {
                int num = Integer.parseInt(numerator);
                result = num / divisor;
                System.out.println(numerator + " / " + divisor + " = " + result);
            } catch (ArithmeticException e) {
                System.out.println("Can't divide by zero");
            } catch (NumberFormatException e) {
                System.out.println("You entered bad data.");
                System.out.println("Please try again");
            }
        }
    }

}
