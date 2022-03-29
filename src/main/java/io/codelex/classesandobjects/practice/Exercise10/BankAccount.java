package io.codelex.classesandobjects.practice.Exercise10;

// Each BankAccount object represents one user's account
// information including name and balance of money.

public class BankAccount {
    public String name;
    public double balance;


    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }


    public final void deposit(double amount) {
        balance += amount;
    }

    public final void withdraw(double amount) {
        balance -= amount;
    }

     public String toString(String name, double balance) {
        BigDecimal roundedBalance = new BigDecimal(balance);
        BigDecimal newValue = roundedBalance.setScale(2, RoundingMode.HALF_UP);
        BigDecimal negativeValue = new BigDecimal(-1);
        if (balance < 0) {
            return name + ", " + "-" + "$" + newValue.multiply(negativeValue);
        } else {
            return name + ", " + "$" + newValue.multiply(negativeValue);
        }
    }
}
