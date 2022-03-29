package io.codelex.classesandobjects.practice.Exercise13;

public class Account {
    private double balance;
    private String owner;

    public Account(String owner, double balance) {
        this.balance = balance;
        this.owner = owner;
    }

    public double getBalance(String owner) {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawal(double amount) {
        balance -= amount;
    }

    public double balance() {
        return this.balance;
    }

    public void transfer(Account from, Account to, double ammount) {
        from.balance -= ammount;
        to.balance += ammount;
    }

    @Override
    public String toString() {
        return owner + " balance: " + balance;
    }
}
