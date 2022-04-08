package io.codelex.oop2.summary.Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Order {

    List<AbstractItem> order = new ArrayList<>();

    public Order() {

    }

    public void addItem(AbstractItem item) {
        order.add(item);
    }

    public List<AbstractItem> getOrder() {
        return order;
    }

    @Override
    public String toString() {
        return "Order{" +
                "items=" + order +
                '}';
    }
}
