package io.codelex.oop2.summary.Exercise2;

import java.math.BigDecimal;
import java.time.LocalDate;

public class FoodItem extends AbstractItem {

    private LocalDate expiration;

    public FoodItem(String name, BigDecimal price, LocalDate expiration) {
        super(name, price);
        this.expiration = expiration;
    }

    @Override
    public String fullInfo() {
        return super.fullInfo() + "best before" + this.expiration;
    }
}
