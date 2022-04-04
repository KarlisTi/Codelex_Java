package io.codelex.JavaAdvancedTest.Exercise1;

import java.math.BigDecimal;

public class Card {

    private int cardNumber;
    private String owner;
    private int CCVcode;
    private BigDecimal balance;

    public Card(int cardNumber, String owner, int CCVcode, BigDecimal balance) {
        this.cardNumber = cardNumber;
        this.owner = owner;
        this.CCVcode = CCVcode;
        this.balance = balance;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalnace(BigDecimal blanace) {
        this.balance = blanace;
    }

    public void addMoney(BigDecimal money) {
        this.balance = balance.add(money);
    }

    public void withdrawMoney(BigDecimal money) {
        this.balance = balance.add(money);
    }
}
