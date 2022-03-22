package io.codelex.classesandobjects.practice.Exercise8;


public class SavingAccount {

    //mainīgie

    private double annualInterestRate;
    private double balance;
    private double startingBalance;
    private double getTotalDeposited;
    private double getTotalWithdarwn;

    // konsturkors

    public SavingAccount(double startingBalance) {
        this.startingBalance = startingBalance;
    }

// getteri un setteri

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public double getStartingBalance() {
        return startingBalance;
    }

    public void setStartingBalance(double startingBalance) {
        this.startingBalance = startingBalance;
    }

    public double getGetTotalDeposited() {
        return getTotalDeposited;
    }

    public double getGetTotalWithdarwn() {
        return getTotalWithdarwn;
    }
//metodes

    public void deposit(double a) {
        balance += a;
        getTotalDeposited += a;
    }

    public void withdraw(double b) {
        balance -= b;
        getTotalWithdarwn -= b;
    }

    public double monthlyInterest() {
        return (annualInterestRate / 12) * balance;
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "annualInterestRate=" + annualInterestRate +
                ", balance=" + balance +
                '}';
    }


}
