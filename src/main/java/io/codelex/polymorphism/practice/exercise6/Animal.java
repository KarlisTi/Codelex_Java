package io.codelex.polymorphism.practice.exercise6;

import java.util.ArrayList;
import java.util.List;

abstract class Animal {

    private String animalType;
    private String animalName;
    private double animalWeight;
    private Integer foodEaten;
    List<Animal> animals = new ArrayList<>();

    public Animal(String animalType, String animalName, double animalWeight, Integer foodEaten) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.foodEaten = foodEaten;
    }

    public Animal(String animalType, String animalName, double animalWeight) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
    }

    public void makeSound() {

    }

    public void eatFood(String eatFood) {

    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalType='" + animalType + '\'' +
                ", animalName='" + animalName + '\'' +
                ", animalWeight=" + animalWeight +
                '}';


    }

}
