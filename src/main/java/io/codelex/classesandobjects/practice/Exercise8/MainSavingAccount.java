package io.codelex.classesandobjects.practice.Exercise8;

import java.util.Scanner;

public class MainSavingAccount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SavingAccount balanced = new SavingAccount(10000);
        System.out.print("How much money is in the account?: ");
        System.out.print(balanced.getBalance());
        System.out.println();

        System.out.println("Enter the annual interest rate: ");
        double annualInterest = scan.nextDouble();
        balanced.setAnnualInterestRate(annualInterest);

        System.out.println("How long has the account been opened");
        double moths = scan.nextDouble();


        for (int i = 1; i <= moths; i++) {

            System.out.println("Enter amount deposited for month: " + i);

            System.out.printf("Enter the amount deposited into the account: ");
            balanced.deposit(scan.nextDouble());
            balanced.monthlyInterest();

            System.out.printf("Enter the amount withdrawn from the account: ");
            balanced.withdraw(scan.nextDouble());


        }

        System.out.println("Total deposited: $" + balanced.getGetTotalDeposited());
        System.out.println("Total withdrawn: $" + balanced.getGetTotalWithdarwn());
        System.out.println("Interest earned: $" + balanced.monthlyInterest() * moths);
        System.out.println("Ending balance: $" + balanced.getBalance());

    }

}
