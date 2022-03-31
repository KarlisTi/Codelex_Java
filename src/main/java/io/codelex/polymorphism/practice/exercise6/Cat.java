package io.codelex.polymorphism.practice.exercise6;

public class Cat extends Felime {

    String breed;


    public Cat(String animalType, String animalName, double animalWeight, String livingRegion, String breed, Integer foodEaten) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
        this.breed = breed;
    }

    public Cat(String animalType, String animalName, double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }


    @Override
    public void makeSound() {
        System.out.println("Meeowww");
    }


    @Override
    public void eatFood(String eatFood) {
        super.eatFood(eatFood);
    }

    @Override
    public String toString() {
        return super.toString() +
                "breed " + this.breed;
    }
}



