package io.codelex.JavaAdvancedTest.Exercise1;

import java.math.BigDecimal;

public class CreditCard extends Card {


    public CreditCard(int cardNumber, String owner, int CCVcode, BigDecimal balance) {
        super(cardNumber, owner, CCVcode, balance);
    }

    @Override
    public BigDecimal getBalance() {
        return super.getBalance();
    }


    @Override
    public void addMoney(BigDecimal money) {
        super.addMoney(money);

    }

    @Override
    public void withdrawMoney(BigDecimal money) {
        if (getBalance().compareTo(BigDecimal.valueOf(100)) < 0) {
            System.out.println("Warning: low funds");
        }
        super.withdrawMoney(money);

    }
}


