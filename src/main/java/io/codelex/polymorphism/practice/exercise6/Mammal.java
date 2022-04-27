package io.codelex.polymorphism.practice.exercise6;

abstract class Mammal extends Animal {

    String livingRegion;


    public Mammal(String animalType, String animalName, double animalWeight, String livingRegion, Integer foodEaten) {
        super(animalName, animalType, animalWeight, foodEaten);
        this.livingRegion = livingRegion;
    }

    public Mammal(String animalType, String animalName, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
    }

    @Override
    public void eatFood(String eatFood) {
        super.eatFood(eatFood);
    }

    @Override
    public String toString() {
        return super.toString()
                + " living " + this.livingRegion;
    }
}
