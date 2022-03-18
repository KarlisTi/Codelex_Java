package io.codelex.oop.Exercise2;

public class Customer extends Person {

    String customerId;
    int purchaseCount;

    public Customer(String firstName, String lastName, String customerId, int purchaseCount) {
        super(firstName, lastName);
        this.customerId = customerId;
        this.purchaseCount = purchaseCount;
    }


    @Override
    String getInfo() {
        return firstName + " " + lastName + " " + customerId + " " + "(" + purchaseCount + " purchases)";
    }
}
