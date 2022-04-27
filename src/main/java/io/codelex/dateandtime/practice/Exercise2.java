package io.codelex.dateandtime.practice;


import java.text.ParseException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter date when server was launched (time format: dd/mm/yyyy)");
        String launchDate = scan.nextLine();
        DateTimeFormatter dateFormatOne = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate start = LocalDate.parse(launchDate, dateFormatOne);

        System.out.println("Enter last date to see when take updates (time format: mm/yyyy)");
        String updatePeriod = scan.nextLine();
        String[] newString = updatePeriod.split(" ");
        int year = Integer.parseInt(newString[1]);
        String fullDate = "01" + "/" + "0" + getMonthNumber(newString[0]) + "/" + year;
        System.out.println(fullDate);
        DateTimeFormatter dateFormatTwo = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate end = LocalDate.parse(fullDate, dateFormatTwo).plusMonths(1);


        for (LocalDate date = start; date.isBefore(end); date = date.plusDays(14)) {
            if (date.isAfter(end.minusMonths(1))) {
                System.out.println(date);
            }
        }
    }

    private static int getMonthNumber(String monthName) {
        return Month.valueOf(monthName.toUpperCase()).getValue();
    }


}
