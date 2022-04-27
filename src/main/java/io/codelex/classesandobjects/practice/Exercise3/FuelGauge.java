package io.codelex.classesandobjects.practice.Exercise3;

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
}