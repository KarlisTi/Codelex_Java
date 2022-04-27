package io.codelex.polymorphism.practice.exercise6;

abstract class Felime extends Mammal {


    public Felime(String animalType, String animalName, double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion, foodEaten);
    }

    public Felime(String animalType, String animalName, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }


    @Override
    public void eatFood(String eatFood) {
        super.eatFood(eatFood);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
