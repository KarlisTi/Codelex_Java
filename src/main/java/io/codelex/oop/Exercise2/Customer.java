package io.codelex.oop.Exercise2;

public class Customer extends Person {

    private String customerId;
    private int purchaseCount;

    public Customer(String firstName, String lastName, String customerId, int purchaseCount) {
        super(firstName, lastName);
        this.customerId = customerId;
        this.purchaseCount = purchaseCount;
    }


    @Override
    String getInfo() {
        return getFirstName() + " " + getLastName() + " " + this.customerId + " " + "(" + this.purchaseCount + " purchases)";
    }
}
