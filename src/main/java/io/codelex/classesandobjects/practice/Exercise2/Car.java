package io.codelex.classesandobjects.practice.Exercise2;

public class Car {
    
    private double startKilometers;
    private double endKilometers;
    private double liters;

    
    public Car(double startKilometers, double endKilometers, double liters) {
    this.startKilometers = startKilometers;
    this.endKilometers = endKilometers;
    this.liters = liters;
    }
    
    public double getStartKilometers() {
        return startKilometers;
    }

    public void setStartKilometers(double startKilometers) {
        this.startKilometers = startKilometers;
    }

    public double getEndKilometers() {
        return endKilometers;
    }

    public void setEndKilometers(double endKilometers) {
        this.endKilometers = endKilometers;
    }

    public double getLiters() {
        return liters;
    }

    public void setLiters(double liters) {
        this.liters = liters;
    }

    public static double calculateConsumption(double start,double end, double liters) {
           return (end - start)* liters;
        }
        public static boolean gasHog(double a){
            return a > 15.0;
        }
        public static boolean economyCar(double b){
            return b < 5.0;
        }

    }


