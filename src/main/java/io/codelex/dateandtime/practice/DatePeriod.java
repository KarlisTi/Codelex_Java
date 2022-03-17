package io.codelex.dateandtime.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DatePeriod {
    public static void main(String[] args) {

        LocalDate firstStart = LocalDate.of(2022, 1, 5);
        LocalDate firstEnd = LocalDate.of(2022, 1, 7);

        LocalDate secondStart = LocalDate.of(2022, 1, 2);
        LocalDate secondEnd = LocalDate.of(2022, 1, 10);

        intersection(firstStart, firstEnd, secondStart, secondEnd);
    }

    public static void intersection(LocalDate firstStart, LocalDate firstEnd, LocalDate secondStart, LocalDate secondEnd) {
        if (firstStart.compareTo(secondStart) < 0 && firstEnd.compareTo(secondStart) > 0) {
            System.out.println("Days of overlaying- " + firstEnd.compareTo(secondStart));
        } else if (firstStart.compareTo(secondEnd) < 0 && firstEnd.compareTo(secondEnd) > 0) {
            System.out.println("Days of overlaping- " + firstStart.compareTo(secondEnd) * (-1));
        } else if (firstStart.compareTo(secondStart) < 0 && firstEnd.compareTo(secondEnd) > 0) {
            System.out.println("Days of overlaping- " + secondStart.compareTo(secondEnd) * -(1));
        } else if (firstStart.compareTo(secondStart) > 0 && firstEnd.compareTo(secondEnd) < 0) {
            System.out.println("Days of overlaping- " + firstStart.compareTo(firstEnd) * (-1));
        } else {
            System.out.println("null");
        }
    }
}


