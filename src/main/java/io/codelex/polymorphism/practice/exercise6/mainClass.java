package io.codelex.polymorphism.practice.exercise6;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class mainClass {
    public static void main(String[] args) {
        DecimalFormat decimalf = new DecimalFormat("#,###");
        decimalf.setRoundingMode(RoundingMode.FLOOR);

        Scanner scan = new Scanner(System.in);
        List<Animal> allAnimals = new ArrayList<>();


        Cat newCat;
        Tiger newTiger;
        Zebra newZebra;
        Mouse newMouse;


        while (true) {
            System.out.println("Input animalType, animalName, living, weight breed(if cat)");
            String animalInfo = scan.nextLine();
            if (animalInfo.equals("End")) {
                System.out.println("Program quit");
                break;
            }
            String[] splitInput = animalInfo.split(" ");
            String animalType = splitInput[0];
            String name = splitInput[1];
            String living = splitInput[3];
            double weight = Double.parseDouble(decimalf.format(splitInput[2]));


            if (splitInput[0].equals("Cat")) {
                String breed = splitInput[4];
                newCat = new Cat(animalType, name, weight, living, breed);
                System.out.println(newCat);
                newCat.makeSound();
                String[] splitFood = feedAnimal(scan).split(" ");
                Integer quantity = Integer.parseInt(splitFood[1]);
                Cat nextCat = new Cat(animalType, name, weight, living, breed, quantity);
                System.out.println(nextCat);
                allAnimals.add(nextCat);

            } else if (splitInput[0].equals("Tiger")) {
                newTiger = new Tiger(animalType, name, weight, living);
                System.out.println(newTiger);
                newTiger.makeSound();

                String[] splitFood = feedAnimal(scan).split(" ");
                if (splitFood[0].equals("Vegetable")) {
                    System.out.println(splitFood[0] + " are not eating that type of food!");
                }
                Integer quantity = Integer.parseInt(splitFood[1]);

                Tiger nexTiger = new Tiger(animalType, name, weight, living, quantity);
                System.out.println(nexTiger);
                allAnimals.add(nexTiger);

            } else if (splitInput[0].equals("Mouse")) {
                newMouse = new Mouse(animalType, name, weight, living);
                System.out.println(newMouse);
                newMouse.makeSound();
                String[] splitFood = feedAnimal(scan).split(" ");
                if (splitFood[0].equals("Meat")) {
                    System.out.println(splitFood[0] + " are not eating that type of food!");
                }
                Integer quantity = Integer.parseInt(splitFood[1]);

                Mouse nextMouse = new Mouse(animalType, name, weight, living, quantity);
                System.out.println(nextMouse);
                allAnimals.add(nextMouse);


            } else if (splitInput[0].equals("Zebra")) {
                newZebra = new Zebra(animalType, name, weight, living);
                System.out.println(newZebra);
                newZebra.makeSound();
                String[] splitFood = feedAnimal(scan).split(" ");
                if (splitFood[0].equals("Meat")) {
                    System.out.println(splitFood[0] + " are not eating that type of food!");
                }
                Integer quantity = Integer.parseInt(splitFood[1]);

                Zebra nextZebra = new Zebra(animalType, name, weight, living, quantity);
                System.out.println(nextZebra);
                allAnimals.add(newZebra);
            }
        }
        for (Animal forEach : allAnimals) {
            System.out.println(forEach);

        }
    }


    public static String feedAnimal(Scanner scan) {
        System.out.println("Feed animal");
        String food = scan.nextLine();
        return food;
    }
}
