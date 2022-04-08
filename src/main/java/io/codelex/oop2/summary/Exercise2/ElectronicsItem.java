package io.codelex.oop2.summary.Exercise2;

import java.math.BigDecimal;

public class ElectronicsItem extends AbstractItem {

    private String power;


    public ElectronicsItem(String name, BigDecimal price, String power) {
        super(name, price);
        this.power = power;
    }

    @Override
    public String fullInfo() {
        return super.fullInfo() + "power: " + this.power;
    }
}
