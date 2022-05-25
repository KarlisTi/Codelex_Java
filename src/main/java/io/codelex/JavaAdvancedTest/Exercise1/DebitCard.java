package io.codelex.JavaAdvancedTest.Exercise1;

import java.math.BigDecimal;

public class DebitCard extends Card {


    public DebitCard(int cardNumber, String owner, int CCVcode, BigDecimal balance) {
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
        super.withdrawMoney(money);
    }
}


