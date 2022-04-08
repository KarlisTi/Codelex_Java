package io.codelex.oop2.summary.Exercise2;

import java.math.BigDecimal;

public class HouseholdItem extends AbstractItem {
    private String color;


    public HouseholdItem(String name, BigDecimal price, String color) {
        super(name, price);
        this.color = color;
    }

    @Override
    public String fullInfo() {
        return super.fullInfo() + "Color: " + this.color;
    }
}
