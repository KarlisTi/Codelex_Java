package io.codelex.oop.Cars;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        CarService newService = new CarService();
        List<Manafacturer> firstList = new ArrayList<>();
        List<Manafacturer> secondList = new ArrayList<>();
        List<Manafacturer> thirdList = new ArrayList<>();
        List<Manafacturer> fourthList = new ArrayList<>();
        Manafacturer first = new Manafacturer("General motors", 1908, "USA");
        Manafacturer second = new Manafacturer("The Volkswagen group", 1909, "Germany");
        Manafacturer third = new Manafacturer("Chrysler Corporation", 1928, "USA");
        Manafacturer fourth = new Manafacturer("Bavarian Motor Works", 1916, "Germany");
        firstList.add(first);
        firstList.add(second);
        firstList.add(third);
        secondList.add(second);
        thirdList.add(third);
        fourthList.add(fourth);


        Car firstCar = new Car("Ford", "Mondeo", 10000, 2012, EngineType.S6, firstList);
        Car secondCar = new Car("Jeep", "Cherokee", 12000, 2020, EngineType.V8, secondList);
        Car thirdCar = new Car("Volkswagen", "Golf", 5000, 1995, EngineType.S4, secondList);
        Car fourthCar = new Car("Dodge", "Viper", 30000, 2000, EngineType.V12, thirdList);
        Car fifhtCar = new Car("BMW", "530", 5200, 2006, EngineType.V6, fourthList);
        Car sixtCar = new Car("Audi", "100", 2300, 1989, EngineType.V8, fourthList);
        Car seventhCar = new Car("Skoda", "Superb", 25000, 2021, EngineType.S6, secondList);


        fillCarList(newService, firstCar);
        fillCarList(newService, secondCar);
        fillCarList(newService, thirdCar);
        fillCarList(newService, fourthCar);
        fillCarList(newService, fifhtCar);
        fillCarList(newService, sixtCar);
        fillCarList(newService, seventhCar);

//        removeCarFromList(newService, seventhCar);
//        System.out.println();
        returnCarList(newService);
//        System.out.println();
//        filterByEngine(newService);
//        System.out.println();
//        oldCars(newService);
//       System.out.println();
//        expensiveCars(newService);
//        System.out.println();
//        cheaperCars(newService);
//        System.out.println();
//        threeManafacuters(newService);
//        sortCars(newService);
//        searchCar(newService);
//        searchByManufacturer(newService);
        yearEstablishment(newService);


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
        newService.returnOldCars(1999);
    }

    static void expensiveCars(CarService newService) {
        newService.returnExpensiveCars(10000);
    }

    static void cheaperCars(CarService newService) {
        newService.returnCheapestCars(10000);
    }

    static void threeManafacuters(CarService newService) {
        newService.returnCarsWithThreeManufaturer();
    }

    static void sortCars(CarService newService) {
        newService.sortCars("descending");
    }

    static void searchCar(CarService newService) {
        newService.searchForCar("BMW");
    }

    static void searchByManufacturer(CarService newService) {
        newService.searchByManafacuter("Bavarian Motor Works");
    }

    static void yearEstablishment(CarService newService) {
        newService.establishmentYear(">= 1928");
    }

}




