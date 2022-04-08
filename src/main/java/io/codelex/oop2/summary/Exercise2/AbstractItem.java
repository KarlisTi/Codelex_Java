package io.codelex.oop2.summary.Exercise2;

import java.math.BigDecimal;

abstract class AbstractItem implements Item {

    private String name;
    private BigDecimal price;

    public AbstractItem(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String returnName() {
        return this.name;
    }

    @Override
    public BigDecimal returnPrice() {
        return this.price;
    }

    @Override
    public String fullInfo() {
        return returnName() + "," + returnPrice() + "EUR";

    }
}
