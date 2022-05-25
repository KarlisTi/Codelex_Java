package io.codelex.trainingExercises.generics;

public class mainClass {
    public static void main(String[] args) {

        Milk milk = new Milk();
        Bottle<Milk> milkBottle = new Bottle<>(milk);
        milkBottle.printOutContents();


        Water water = new Water();
        Bottle<Water> waterBottle = new Bottle<>(water);
        waterBottle.printOutContents();

    }

    public static <T extends Liquid> Bottle<T> createBottleWithContent(T contents) {
        Bottle<T> newBottle = new Bottle<>(contents);
        return newBottle;
    }
}