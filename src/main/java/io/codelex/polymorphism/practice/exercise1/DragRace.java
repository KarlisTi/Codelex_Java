package io.codelex.polymorphism.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of an each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {

    public static void main(String[] args) {
        List<Car> newCarList = new ArrayList<>();
        Audi newAudi = new Audi(0);
        Bmw newBMW = new Bmw(0);
        Porche newPorche = new Porche(0);
        Subaru newSubaru = new Subaru(0);
        Lexus newLexus = new Lexus(0);
        Tesla newTesla = new Tesla(0);
        int fastestCar = 0;
        String className = null;

        newCarList.add(newAudi);
        newCarList.add(newBMW);
        newCarList.add(newPorche);
        newCarList.add(newSubaru);
        newCarList.add(newLexus);
        newCarList.add(newTesla);

        int i = 0;
        while (i < 10) {
            for (Car newCar : newCarList) {
                newCar.speedUp();
                if (i == 3) {
                    newLexus.useNitrousOxideEngine();
                    newSubaru.useNitrousOxideEngine();
                }
                if (newCar.getCurrentSpeed() > fastestCar) {
                    fastestCar = newCar.getCurrentSpeed();
                    className = newCar.getClass().getSimpleName();
                }
            }
            i++;
        }
        System.out.println(className);
        System.out.println(fastestCar);

    }


}






