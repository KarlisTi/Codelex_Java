package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class exercise8 {
    public static void main(String[] args) {
        int minutesIntoYear = 60 * 24 * 365;
        System.out.println(minutesIntoYear);
        Scanner scan = new Scanner(System.in);
        int inputMinutes = scan.nextInt();
        int years = inputMinutes/minutesIntoYear;
        int days = (inputMinutes / 60 / 24);
        System.out.println("years:"+ years);
        System.out.println("days"+ days);
    }
}
