package io.codelex.polymorphism.practice.exercise6;

public class Zebra extends Mammal {

    public Zebra(String animalType, String animalName, double animalWeight, String livingRegion, Integer foodEaten) {
        super(animalName, animalType, animalWeight, livingRegion, foodEaten);
    }

    public Zebra(String animalType, String animalName, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("prrrrrrr");
    }

    @Override
    public void eatFood(String eatFood) {
        super.eatFood(eatFood);
    }
}
