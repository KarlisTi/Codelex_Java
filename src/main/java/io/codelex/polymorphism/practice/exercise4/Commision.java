//package io.codelex.polymorphism.practice.exercise4;
//
//import java.math.BigDecimal;
//
//public class Commision extends Hourly {
//    private BigDecimal totalSales;
//    private BigDecimal commisionRate;
//
//
//    public Commision(String eName, String eAddress, String ePhone, String socSecNumber, double rate, BigDecimal commisionRate) {
//        super(eName, eAddress, ePhone, socSecNumber, rate);
//        this.commisionRate = commisionRate;
//    }
//
//    public void addSales(BigDecimal totalSales) {
//        this.totalSales.add(totalSales);
//    }
//
//    @Override
//    public double pay() {
//        return super.pay();
//    }
//
//    @Override
//    public String toString() {
//        return super.toString();
//
//    }
//}
