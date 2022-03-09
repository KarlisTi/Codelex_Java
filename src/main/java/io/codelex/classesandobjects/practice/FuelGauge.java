package io.codelex.classesandobjects.practice;

public class FuelGauge {
    private int fuelInLiters;

    public int getFuelInLiters() {
        return fuelInLiters;
    }

    public void setFuelInLiters(int fuelInLiters) {
        this.fuelInLiters = fuelInLiters;
    }


    public FuelGauge(int fuelInLiters) {
        this.fuelInLiters = fuelInLiters;
    }

    public void fillFuel() {
        if (this.fuelInLiters < 70) {
            this.fuelInLiters += 1;
        } else {
            System.out.println("fuel tank is full");
        }
    }

    public void drivingCar() {
        if (this.fuelInLiters > 0) {
            this.fuelInLiters -= 1;
        }
    }

    @Override
    public String toString() {
        return "FuelGauge{" +
                "fuelInLiters=" + fuelInLiters +
                '}';


    }

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