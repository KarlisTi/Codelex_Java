package io.codelex.training.typesandvariables.practice;

import java.util.Scanner;

public class exercise9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input distance in meters:");
        int inputDistance = scan.nextInt();
        System.out.println("Input hours:");
        int inputHour = scan.nextInt();
        System.out.println("Input minutes");
        int inputMinutes = scan.nextInt();
        System.out.println("Input seconds");
        int inputSeconds = scan.nextInt();

        double secondsInHours = 3600;
        double totalTimeInSeconds = ((inputHour * secondsInHours) + (inputMinutes * 60) + inputSeconds);
        double metersInSeconds = inputDistance / totalTimeInSeconds;
        double totalTimeInHours = inputHour + inputMinutes * (1 / 60.0) + inputSeconds * (1 / secondsInHours);
        double kmInH = (inputDistance / 1000.0) / totalTimeInHours;
        double milesInH = kmInH / 1.609;

        System.out.println("Your speed in meters/seconds is:" + metersInSeconds);
        System.out.println("Your speed in km/h is:" + kmInH);
        System.out.println("Your speed in miles/h :" + milesInH);

    }
}
