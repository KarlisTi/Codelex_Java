package io.codelex.JavaAdvancedTest.Exercise1;

import java.math.BigDecimal;

public class CreditCard extends Card implements warning {

    private BigDecimal lowFunds;


    public CreditCard(int cardNumber, String owner, int CCVcode, BigDecimal balance) {
        super(cardNumber, owner, CCVcode, balance);
    }

    @Override
    public BigDecimal getBlanace() {
        return super.getBlanace();
    }

    @Override
    public void warning() {
        if (getBlanace().compareTo(lowFunds) < 100) {
            warning myWarning = () -> {
                System.out.println("Low funds");
            };
        }

    }
}
