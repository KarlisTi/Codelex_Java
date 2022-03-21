package io.codelex.classesandobjects.practice.Exercise10;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Janis", 17.25);

        System.out.println(account.toString(account.getName(), account.getBalance()));

    }


}
