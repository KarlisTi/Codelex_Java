package io.codelex.collections.practice;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a number");
        int number = scan.nextInt();
        int newNumber = number;
        while (newNumber != 1 && newNumber != 4) {
            newNumber = calculate(newNumber);
        }
        if (newNumber == 1) {
            System.out.println(number + " is happy number");
        } else if (number == 4) {
            System.out.println(number + " is not a happy number");
        }
    }

    public static int calculate(int number) {
        int sum = 0;
        int result = 0;
        while (number > 0) {
            result = number % 10;
            sum += (result * result);
            number /= 10;
        }
        return sum;
    }

}



