package io.codelex.polymorphism.practice.exercise4;//package io.codelex.polymorphism.practice.exercise4;

import java.math.BigDecimal;

public class Commision extends Hourly {
    private double totalSales;
    private double commisionRate;


    public Commision(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commisionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commisionRate = commisionRate;
    }

    public void addSales(double totalSales) {
        this.totalSales += totalSales * commisionRate;
    }

    @Override
    public double pay() {
        return super.pay() + totalSales;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Total sales: " + totalSales;

    }
}
