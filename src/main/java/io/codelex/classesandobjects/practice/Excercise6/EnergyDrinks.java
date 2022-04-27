package io.codelex.classesandobjects.practice.Excercise6;

public class EnergyDrinks {

    static final int NUMBERED_SURVEYED = 12467;
    static final double PURCHASED_ENERGY_DRINKS = 0.14;
    static final double PREFER_CITRUS_DRINKS = 0.64;


    public static void main(String[] args) {
        //fixme
        System.out.println("Total number of people surveyed " + NUMBERED_SURVEYED);
        System.out.println("Approximately " + calculatePreferCitris() + " bought at least one energy drink");
        System.out.println(calculateEnergyDrinkers() + " of those " + "prefer citrus flavored energy drinks.");
    }

    public static double calculateEnergyDrinkers() {
        return NUMBERED_SURVEYED * PREFER_CITRUS_DRINKS;

    }

    public static double calculatePreferCitris() {
        return NUMBERED_SURVEYED * PURCHASED_ENERGY_DRINKS;
    }
}
