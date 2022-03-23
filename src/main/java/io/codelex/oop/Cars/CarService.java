package io.codelex.oop.Cars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarService {

    List<Car> cars = new ArrayList<>();


    public void addCarToList(Car carName) {
        cars.add(carName);
    }

    public void removeCarFromList(Car carName) {
        cars.remove(carName);
    }

    public void returnListOfCars() {
        for (Car allCars : cars) {
            System.out.println(allCars);
        }
    }

    public void returnByEningeType(EngineType type) {
        for (Car engine : cars) {
            if (engine.getEngine().equals(type)) {
                System.out.println(engine.getName() + " have a " + type + " engine");

            }
        }
    }

    public void returnOldCars(int yearOfManufacture) {
        for (Car yearOf : cars) {
            if (yearOf.getYearOfManafacture() <= yearOfManufacture) {
                System.out.println(yearOf.getName() + " is the same year or its older than " + yearOfManufacture);
            }
        }

    }

    public void returnExpensiveCars(int price) {
        for (Car amount : cars) {
            if (amount.getPrice() > price) {
                System.out.println(amount.getName() + " is more expensive than " + price);
            }
        }
    }

    public void returnCheapestCars(int price) {
        for (Car amount : cars) {
            if (amount.getPrice() < price) {
                System.out.println(amount.getName() + " is cheaper than " + price);

            }

        }
    }

    public void returnCarsWithThreemanafaturer() {
        for (Car size : cars) {
            if (size.getManufacturer().size() > 3) ;
            System.out.println(size.getName());
        }
    }


    public void sortCars(String nameOfAction) {
        ArrayList<String> newList = new ArrayList<>();
        for (Car newCars : cars) {
            newList.add(newCars.getName());
        }
        if (nameOfAction.equals("ascending")) {
            Collections.sort(newList);
        } else if (nameOfAction.equals("descending")) {
            Collections.reverse(newList);
        }
        System.out.println(newList);
    }


    public void searchForCar(String name) {
        for (Car carName : cars) {
            if (carName.getName().contains(name)) {
                System.out.println(carName.getName() + " is on the list");
            } else {
                System.out.println("Can't find a car");
            }
        }

    }

    public void searchByManafacuter(String name) {
        for (Car carList : cars) {
            for (Manafacturer value : carList.manufacturer)
                if (carList.getManufacturer().equals(name)) {
                    System.out.println("The car " + carList.getName() + " is on the list");
                } else {
                    System.out.println("Can't find the car that you are looking for");
                }
        }

    }

    public void establishmentYear(String year, Manafacturer manufacturer) {
        String[] newString = year.split(" ");
        int newNum = Integer.parseInt(newString[1]);
        if (newString[0].contains(">")) {
            for (Car eachCar : cars) {
                if (manufacturer.getYearEstablishment() > newNum || manufacturer.getYearEstablishment() < newNum ||
                        manufacturer.getYearEstablishment() >= newNum || manufacturer.getYearEstablishment() <= newNum ||
                        manufacturer.getYearEstablishment() != newNum) {
                    System.out.println(eachCar.getName());

                }

            }
        }
    }

    @Override
    public String toString() {
        return "CarService{" +
                "cars=" + cars +
                '}';
    }
}
