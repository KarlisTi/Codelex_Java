package io.codelex.classesandobjects.practice.Exercise2;

import java.util.Scanner;

public class LittersPerKilometrs {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double startKilometers, endKilometers, liters;
        System.out.println("Insert data for the first car");
        System.out.print("Enter first reading: ");
        startKilometers = scan.nextDouble();

        System.out.print("Enter second reading: ");
        endKilometers = scan.nextDouble();

        System.out.print("Enter liters consumed: ");
        liters = scan.nextDouble();

        Car car = new Car(startKilometers, endKilometers, liters);

        System.out.println("Kilometers per liter are " + Car.calculateConsumption(startKilometers, endKilometers, liters));
        if (Car.economyCar(Car.calculateConsumption(startKilometers, endKilometers, liters))) {
            System.out.println("This car is economy car");

            System.out.println("Insert data for the second car");
            System.out.print("Enter first reading: ");
            startKilometers = scan.nextDouble();

            System.out.print("Enter second reading: ");
            endKilometers = scan.nextDouble();

            System.out.print("Enter liters consumed: ");
            liters = scan.nextDouble();

            Car secondCar = new Car(startKilometers, endKilometers, liters);

            System.out.println("Kilometers per liter are " + Car.calculateConsumption(startKilometers, endKilometers, liters));
            if (Car.economyCar(Car.calculateConsumption(startKilometers, endKilometers, liters))) {
                System.out.println("This car is economy car");
            }
        }
    }
}