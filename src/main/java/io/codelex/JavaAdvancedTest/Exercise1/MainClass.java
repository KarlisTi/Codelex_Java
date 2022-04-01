package io.codelex.JavaAdvancedTest.Exercise1;

import java.math.BigDecimal;
import java.util.Scanner;

import static org.apache.commons.lang3.RandomUtils.nextInt;

public class MainClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        CreditCard newCreditCard = new CreditCard(54321, "Janis Ozols", 023, new BigDecimal(200));
        DebitCard newDebitCard = new DebitCard(56789, "Anna Zarina", 567, new BigDecimal(150));
        BigDecimal add;
        BigDecimal withdraw;
        BigDecimal add1;
        BigDecimal withdraw1;



        System.out.println("What card would you like to use Credit or Debit. (write Credit or Debit");
        String choseCard = scan.nextLine().toUpperCase();

        System.out.println("Do you want to add or withdraw money (write add or withdraw)");
        String action = scan.nextLine();

        if (action.equals("ADD") && choseCard.equals("CREDIT")) {
            System.out.println("Enter amount that you want add to card");
            add = scan.nextBigDecimal();

        } else if (action.equals("WITHDRAW") && choseCard.equals("CREDIT")) {
            try {
                System.out.println("Enter amount that you want to withdraw");
              withdraw = scan.nextBigDecimal();
            } catch (Exception e) {
                System.out.println("A problem occurred: " + e);
            }
            checkCreditCard(choseCard,action,newCreditCard,add,withdraw)
        }

        if (action.equals("ADD") && choseCard.equals("DEBIT")) {
            System.out.println("Enter amount that you want add to card");
            add1 = scan.nextBigDecimal();

        } else if (action.equals("WITHDRAW") && choseCard.equals("DEBIT")) {
            try {
                System.out.println("Enter amount that you want to withdraw");
                BigDecimal withdraw1 = scan.nextBigDecimal();
            } catch (Exception e) {
                System.out.println("A problem occurred: " + e);
            }
            checkDebitCard(choseCard,action,newCreditCard,add1,withdraw1)
        }

    }

    public static void checkCreditCard(String choseCard, String action, CreditCard newCreditCard,
                                BigDecimal add, BigDecimal withdraw) throws NotEnoughtFundsException {
        if (choseCard.equals("CREDIT") && action.equals("ADD")) {
            newCreditCard.addMoney(add);
        } else if (choseCard.equals("CREDIT") && action.equals("WITHDRAW")) {
            newCreditCard.addMoney(withdraw);
            if (withdraw.compareTo(newCreditCard.getBlanace()) < -1) {
                throw new NotEnoughtFundsException("\n" + "Inefficient founds ");
            }
        }
    }

    public static void checkDebitCard(String choseCard, String action, DebitCard newDebitCard,
                               BigDecimal add, BigDecimal withdraw) throws NotEnoughtFundsException {
        if (choseCard.equals("DEBIT") && action.equals("ADD")) {
            newDebitCard.addMoney(add);
        } else if (choseCard.equals("DEBIT") && action.equals("WITHDRAW")) {
            newDebitCard.addMoney(withdraw);
            if (withdraw.compareTo(newDebitCard.getBlanace()) < -1) {
                throw new NotEnoughtFundsException("\n" + "Inefficient founds ");
            }
        }
    }
}