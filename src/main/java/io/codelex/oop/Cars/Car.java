package io.codelex.oop.Cars;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car {
    String name;
    String model;
    int price;
    int yearOfManafacture;
    EngineType engine;

    List<Manafacturer> manufacturer = new ArrayList<>();


    public Car(ArrayList<Manafacturer> manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Car(String name, String model, int price, int yearOfManafacture, EngineType engine, List<Manafacturer> manufacturer) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManafacture = yearOfManafacture;
        this.engine = engine;
        this.manufacturer = manufacturer;
    }


    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public EngineType getEngine() {
        return engine;
    }

    public int getYearOfManafacture() {
        return yearOfManafacture;
    }

    public int getPrice() {
        return price;
    }

    public List<Manafacturer> getManufacturer() {
        return manufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return price == car.price && yearOfManafacture == car.yearOfManafacture && Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(manufacturer, car.manufacturer) && engine == car.engine;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, yearOfManafacture, manufacturer, engine);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", yearOfManafacture=" + yearOfManafacture +
                ", manufacturer=" + manufacturer +
                ", engine=" + engine +
                '}';
    }
}
