package io.codelex.classesandobjects.practice.Exercise13;

public class Account_main {

    public static void main(String[] args) {

        Account bartosAccount = new Account("Barto's account", 100.00);
        Account bartosSwissAccount = new Account("Barto's account in Switzerland", 1000000.00);

        System.out.println("Initial state");
        System.out.println(bartosAccount);
        System.out.println(bartosSwissAccount);

        bartosAccount.withdrawal(20);
        System.out.println("Barto's account balance is now: " + bartosAccount.balance());
        bartosSwissAccount.deposit(200);
        System.out.println("Barto's Swiss account balance is now: " + bartosSwissAccount.balance());

        System.out.println("Final state");
        System.out.println(bartosAccount);
        System.out.println(bartosSwissAccount);

        Account mattsAccount = new Account("Matt", 100);
        Account myAccount = new Account("Me", 0);
        Account andrisAccount = new Account("Andris", 0);
        System.out.println(mattsAccount);
        System.out.println(myAccount);


        mattsAccount.transfer(mattsAccount, myAccount, 50);
        myAccount.transfer(myAccount, andrisAccount, 25);

        System.out.println(mattsAccount.getBalance("Matt"));
        System.out.println(myAccount.getBalance("Me"));
        System.out.println(andrisAccount.getBalance("Andris"));


    }
}
