package io.codelex.classesandobjects.practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SavingAccount {

    //mainīgie

    private int annualInterestRate;
    private  int balance;
    private int startingBalance;

    // konsturkors

    public SavingAccount( int startingBalance) {
        this.startingBalance = startingBalance;
    }

// getteri un setteri

    public int getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(int annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    public int getStartingBalance() {
        return startingBalance;
    }

    public void setStartingBalance(int startingBalance) {
        this.startingBalance = startingBalance;
    }



    //metodes

    public int deposit() {

    }

    public int withdraw() {

    }

    public  int monthlyInterest(int months) {
        return  (annualInterestRate /12)*balance;
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "annualInterestRate=" + annualInterestRate +
                ", balance=" + balance +
                '}';
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SavingAccount balanced = new SavingAccount(10000);
        System.out.print("How much money is in the account?: ");
        System.out.print(balanced.getBalance());
        System.out.println();
        System.out.println("Enter the annual interest rate: ");
        int annualInterest = scan.nextInt();
        SavingAccount annual = new SavingAccount(annualInterest);
        System.out.print("How long has the account been opened");
        int months = scan.nextInt();


    }
}
}