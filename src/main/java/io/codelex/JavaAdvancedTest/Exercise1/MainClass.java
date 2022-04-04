package io.codelex.JavaAdvancedTest.Exercise1;


import java.math.BigDecimal;
import java.util.Scanner;


public class MainClass {
    public static void main(String[] args) throws NotEnoughtFundsException {
        Scanner scan = new Scanner(System.in);

        CreditCard newCreditCard = new CreditCard(54321, "Janis Ozols", 023, new BigDecimal(0));
        DebitCard newDebitCard = new DebitCard(56789, "Anna Zarina", 567, new BigDecimal(0));
        boolean programRunning = true;

        while (programRunning) {
            System.out.println("Please insert a card");
            System.out.println("Chose your type of card:for credit card press 1, or debit car press 2");
            int chooseCard = scan.nextInt();
            System.out.println("If you want to add money press 1 or withdraw press 2 or press 3 to quit program");
            int addOrWithdraw = scan.nextInt();
            if (addOrWithdraw == 3) {
                System.out.println("Program is quiting");
                programRunning = false;
            }
            switch (chooseCard) {
                case 1:
                    System.out.println("You chose credit card");
                    try {
                        creditCard(addOrWithdraw, newCreditCard, scan);
                    } catch (Exception e) {
                        System.out.println("Error was occurred " + e);
                    }
                    break;
                case 2:
                    System.out.println("You chose debit card");
                    try {
                        debitCard(addOrWithdraw, newDebitCard, scan);
                    } catch (Exception e) {
                        System.out.println("Error was occurred " + e);
                    }
                    break;
                default:
                    System.out.println("Please choose your card type");
            }
        }
    }

    public static void creditCard(int addOrWithdraw, CreditCard newCreditCard, Scanner scan) throws NotEnoughtFundsException {
        if (addOrWithdraw == 1) {
            System.out.println("How much money do you want to add?");
            double doubleInput = scan.nextDouble();
            BigDecimal newInput = BigDecimal.valueOf(doubleInput);
            newCreditCard.addMoney(newInput);
            newCreditCard.getBalance();
            System.out.println(newCreditCard.getBalance());
        } else if (addOrWithdraw == 2) {
            System.out.println("How much money do you want to withdraw?");
            double doubleInput = scan.nextDouble();
            BigDecimal withdraw = BigDecimal.valueOf(doubleInput);
            ;
            if (withdraw.compareTo(newCreditCard.getBalance()) > 0) {
                throw new NotEnoughtFundsException("Insufficient fonds");
            } else if (newCreditCard.getBalance().compareTo(BigDecimal.valueOf(100)) <= 0) {
                System.out.println("Warning: low funds");
                newCreditCard.withdrawMoney(withdraw);
            }
        }
    }


    public static void debitCard(int addOrWithdraw, DebitCard newDebitCard, Scanner scan) throws NotEnoughtFundsException {
        if (addOrWithdraw == 1) {
            System.out.println("How much money do you want to add?");
            double doubleInput = scan.nextDouble();
            BigDecimal newInput = BigDecimal.valueOf(doubleInput);
            if (newDebitCard.getBalance().compareTo(BigDecimal.valueOf(10_000)) > 0) {
                System.out.println("Warning: Too much money");
                newDebitCard.addMoney(newInput);
            }
        } else if (addOrWithdraw == 2) {
            System.out.println("How much money do you want to withdraw?");
            double doubleInput = scan.nextDouble();
            BigDecimal withdraw = BigDecimal.valueOf(doubleInput);
            newDebitCard.withdrawMoney(withdraw);
            if (withdraw.compareTo(newDebitCard.getBalance()) > 0) {
                throw new NotEnoughtFundsException("Insufficient fonds");
            }
        }
    }


}
