package io.codelex.polymorphism.practice.exercise6;

public class Vegetable extends Food {

    public Vegetable(Integer quantity) {
        super(quantity);
    }

    @Override
    public Integer getQuantity() {
        return super.getQuantity();
    }
}
