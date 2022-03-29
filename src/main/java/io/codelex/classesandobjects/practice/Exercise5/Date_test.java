package io.codelex.classesandobjects.practice.Exercise5;

import java.util.Scanner;

public class Date_test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Date date = new Date(9, 11, 1986);

        System.out.println("Enter The day");
        int day = input.nextInt();
        date.setDay(day);

        System.out.println("Enter The moth");
        int month = input.nextInt();
        date.setMonth(month);

        System.out.println("Enter the year");
        int myYear = input.nextInt();
        date.setYear(myYear);
        date.displayDate();

    }
}
