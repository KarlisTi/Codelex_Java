package io.codelex.training.pizza;

public class Pizza {
    String bread;
    String souce;
    String cheese;
    String topping;


    public Pizza(String bread) {
        this.bread = bread;
    }

    public Pizza(String bread, String souce) {
        this.bread = bread;
        this.souce = souce;
    }

    public Pizza(String bread, String souce, String cheese) {
        this.bread = bread;
        this.souce = souce;
        this.cheese = cheese;
    }

    public Pizza(String bread, String souce, String cheese, String topping) {
        this.bread = bread;
        this.souce = souce;
        this.cheese = cheese;
        this.topping = topping;
    }
}

