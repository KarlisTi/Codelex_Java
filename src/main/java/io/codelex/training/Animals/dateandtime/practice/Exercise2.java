package io.codelex.training.Animals.dateandtime.practice;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter date when server was launched (time format:dd/mm/yyyy)");
        String launchDate = scan.nextLine();
        DateTimeFormatter dateFormatOne = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate start = LocalDate.parse(launchDate, dateFormatOne);

        System.out.println("Enter last date to see when take updates (time format:dd/mm/yyyy)");
        String updatePeriod = scan.nextLine();
        String[] splitString = updatePeriod.split(" ");
        System.out.println(splitString);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d MMMM, yyyy");
        // LocalDate date = LocalDate.parse(string[0], format);

//        System.out.println(date);
//    }


//        DateTimeFormatter dateFormatTwo = DateTimeFormatter.ofPattern("dd/M/yyyy");
//        LocalDate end = LocalDate.parse(updatePeriod, dateFormatTwo);
//
//        for (LocalDate date = start; date.isBefore(end); date = date.plusDays(14)) {
//            if (date.isAfter(end.minusMonths(1))) {
//                System.out.println(date);
//            }
//        }
    }
}

