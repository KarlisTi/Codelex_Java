package io.codelex.polymorphism.practice.exercise6;

abstract class Food {
    Integer quantity;

    public Food(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }
}