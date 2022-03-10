//package io.codelex.dateandtime.practice;
//
//import javax.sound.midi.Soundbank;
//import java.text.DateFormat;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.time.temporal.ChronoUnit;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.Locale;
//import java.util.Scanner;
//
//public class Exercise1 {
//    public static void main(String[] args) throws ParseException {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter starting date (time format:dd/mm/yyyy)");
//        String startingDate = scan.nextLine();
//        DateTimeFormatter dateFormatOne = DateTimeFormatter.ofPattern("d/M/yyyy");
//        LocalDate start = LocalDate.parse(startingDate, dateFormatOne);
//
//        System.out.println("Enter last work day (time format:dd/mm/yyyy)");
//        String lastWorkingDate = scan.nextLine();
//        DateTimeFormatter dateFormatTwo = DateTimeFormatter.ofPattern("d/M/yyyy");
//        LocalDate end = LocalDate.parse(startingDate, dateFormatOne);
//
//        Calendar cal1 = Calendar.getInstance();
//        Calendar cal2 = Calendar.getInstance();
//        cal1.setTime(start);
//        cal2.setTime(date2);
//
//
//        int numberOfDays = 0;
//        while (start.before(end)) {
//            if ((Calendar.SATURDAY != start.get(Calendar.DAY_OF_WEEK))
//                    &&(Calendar.SUNDAY != cal1.get(Calendar.DAY_OF_WEEK))) {
//                numberOfDays++;
//            }
//            cal1.add(Calendar.DATE,1);
//    }
//
//
//}
