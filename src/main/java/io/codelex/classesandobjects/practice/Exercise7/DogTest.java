package io.codelex.classesandobjects.practice.Exercise7;

public class DogTest {

    public static void main(String[] args) {
        Dog firstDog = new Dog("Max", "male", "Lady", "Rocky");
        Dog secondDog = new Dog("Rocky", "male", "Molly", "Sam");
        Dog thirdDog = new Dog("Sparky", "male");
        Dog fourthdDog = new Dog("Buster", "male", "Lady", "Sparky");
        Dog fifithdDog = new Dog("Sam", "male");
        Dog sixtdDog = new Dog("Lady", "male");
        Dog seventhdDog = new Dog("Molly", "male");
        Dog eigthdDog = new Dog("Coco", "male", "Lady", "Buster");

        eigthdDog.fathersName();
        thirdDog.fathersName();

        eigthdDog.hasSameMotherAs(secondDog);
    }
}
