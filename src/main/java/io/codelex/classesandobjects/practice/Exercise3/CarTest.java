package io.codelex.classesandobjects.practice.Exercise3;

public class CarTest {
    public static void main(String[] args) {
        FuelGauge fuel = new FuelGauge(0);

        int f = 0;
        while (fuel.getFuelInLiters() < 70) {
            fuel.fillFuel();
            f++;
        }

        Odometer odometer = new Odometer(0);
        int counter = 0;
        for (int i = 0; i < 100; i++) {
            odometer.incraseMilage();
            System.out.println(odometer);
            counter++;
            if (counter == 10) {
                fuel.drivingCar();
                System.out.println(fuel);
                counter = 0;
            }
        }
    }
}
