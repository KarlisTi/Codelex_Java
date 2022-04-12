package io.codelex.training.StreamAPI;

import java.math.BigDecimal;

public class Person {

    private String name;
    private String lastName;
    private int age;
    private BigDecimal moneyInBank;


    public Person(String name, String lastName, int age, BigDecimal moneyInBank) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.moneyInBank = moneyInBank;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public BigDecimal getMoneyInBank() {
        return moneyInBank;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", moneyInBank=" + moneyInBank +
                '}';
    }
}
