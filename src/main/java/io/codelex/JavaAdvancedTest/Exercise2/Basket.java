package io.codelex.JavaAdvancedTest.Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {

    private List<T> valueList;
    private int sizeOfBasket = 10;

    public Basket() {
        this.valueList = new ArrayList<>();
    }


    public void addToBasket(T value) throws BasketFullException {
        if (this.valueList.size() == sizeOfBasket) {
            throw new BasketFullException("Basket is full");
        } else {
            this.valueList.add(value);
        }
    }

    public void removeFromBasket(T value) throws BasketEmptyException {
        if (this.valueList.isEmpty()) {
            throw new BasketEmptyException("Basket is empty");
        } else {
            this.valueList.remove(value);
        }

    }


}





