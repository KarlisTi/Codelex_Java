package io.codelex.dateandtime.practice;

import java.text.ParseException;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Exercise1 {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter starting date (time format:dd/mm/yyyy)");
        String startingDate = scan.nextLine();
        DateTimeFormatter dateFormatOne = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate start = LocalDate.parse(startingDate, dateFormatOne);

        System.out.println("Enter last work day (time format:dd/mm/yyyy)");
        String lastWorkingDate = scan.nextLine();
        DateTimeFormatter dateFormatTwo = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate end = LocalDate.parse(lastWorkingDate, dateFormatTwo);

        int startW = start.getDayOfWeek().getValue();
        int endW = end.getDayOfWeek().getValue();

        long days = ChronoUnit.DAYS.between(start, end);
        long result = days - 2 * (days / 7);
        long hoursInDays = 8;

        if (days % 7 != 0) {
            if (startW == 7) {
                result -= 1;
            } else if (endW == 7) {
                result -= 1;
            } else if (endW < startW) {
                result -= 2;
            }
        }
        long daysToHours = result * hoursInDays;
        System.out.println("Employee worked " + daysToHours + " hours in this period ");
    }

}



