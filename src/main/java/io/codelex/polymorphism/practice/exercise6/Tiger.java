package io.codelex.polymorphism.practice.exercise6;

public class Tiger extends Felime {

    public Tiger(String animalType, String animalName, double animalWeight, String livingRegion, Integer foodEaten) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    public Tiger(String animalType, String animalName, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAR");
    }

    @Override
    public void eatFood(String eatFood) {
        super.eatFood(eatFood);
    }

    @Override
    public String toString() {
        return "Tiger{}";
    }


}
