package io.codelex.classesandobjects.practice;

import java.util.Scanner;

public class Date {


    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private int month;
    private static int day;
    private int year;

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void displayDate() {
        System.out.println(this.month + "/" + this.day + "/" + this.year);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Date date = new Date(9, 11, 1986);

        System.out.println("Enter The day");
        int month = input.nextInt();
        date.setDay(day);

        System.out.println("Enter The moth");
        int day = input.nextInt();
        date.setMonth(month);

        System.out.println("Enter the year");
        int myYear = input.nextInt();
        date.setYear(myYear);
        date.displayDate();

    }
}

