package io.codelex.JavaAdvancedTest.Exercise1;

import java.math.BigDecimal;

public class DebitCard extends Card implements warning {

    private BigDecimal toMuchMoney;


    public DebitCard(int cardNumber, String owner, int CCVcode, BigDecimal balance) {
        super(cardNumber, owner, CCVcode, balance);
    }

    @Override
    public BigDecimal getBlanace() {
        return super.getBlanace();
    }

    @Override
    public void warning() {
        if (getBlanace().compareTo(toMuchMoney) > 10000) {
            warning mywarning = () -> {
                System.out.println("in Debit card left less than 1000");
            };
        }
    }
}

