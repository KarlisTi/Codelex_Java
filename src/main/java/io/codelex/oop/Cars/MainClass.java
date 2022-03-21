package io.codelex.oop.Cars;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        CarService newService = new CarService();

        Manafacturer first = new Manafacturer("General motors", 1908, "USA");
        Manafacturer second = new Manafacturer("The Volkswagen group", 1909, "Germany");
        Manafacturer third = new Manafacturer("Chrysler Corporation", 1928, "USA");
        Manafacturer fourth = new Manafacturer("Bavarian Motor Works", 1916, "Germany");


        Car firstCar = new Car("Ford", "Mondeo", 10000, 2012, EngineType.S6);
        Car secondCar = new Car("Jeep", "Cherokee", 12000, 2020, EngineType.V8);
        Car thirdCar = new Car("Volkswagen", "Golf", 5000, 1995, EngineType.S4);
        Car fourthCar = new Car("Dodge", "Viper", 30000, 2000, EngineType.V12);
        Car fifhtCar = new Car("BMW", "530", 5200, 2006, EngineType.V6);
        Car sixtCar = new Car("Audi", "100", 2300, 1989, EngineType.V8);

        fillCarList(newService, firstCar);
        fillCarList(newService, secondCar);
        fillCarList(newService, thirdCar);
        fillCarList(newService, fourthCar);
        fillCarList(newService, fifhtCar);
        fillCarList(newService, sixtCar);
        removeCarFromList(newService, sixtCar);
        returnCarList(newService);
        filterByEngine(newService);
        oldCars(newService);
        expensiveCars(newService);
        cheaperCars(newService);
        //threeManafacuters(newService);
        sortCars(newService);
        searchCar(newService);
    }

    static void fillCarList(CarService newService, Car name) {
        newService.addCarToList(name);
    }

    static void removeCarFromList(CarService newService, Car name) {
        newService.removeCarFromList(name);
    }

    static void returnCarList(CarService newService) {
        newService.returnListOfCars();
    }

    static void filterByEngine(CarService newService) {
        newService.returnByEningeType(EngineType.V8);
    }

    static void oldCars(CarService newService) {
        newService.returnOldCars(2000);
    }

    static void expensiveCars(CarService newService) {
        newService.returnExpensiveCars(10000);
    }

    static void cheaperCars(CarService newService) {
        newService.returnCheapestCars(10000);
    }

//    static void threeManafacuters(CarService newService) {
//        newService.returnCarsWithThreemanafaturer(3);
//    }

    static void sortCars(CarService newService) {
        newService.sortCars("ascending");
    }

    static void searchCar(CarService newService) {
        newService.searchForCar("BMW");
    }
}




