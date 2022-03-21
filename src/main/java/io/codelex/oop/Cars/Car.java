package io.codelex.oop.Cars;

import java.util.ArrayList;
import java.util.Objects;

public class Car {
    String name;
    String model;
    int price;
    int yearOfManafacture;

    ArrayList<Manafacturer> manufacturer;

    EngineType engine;

    public Car(String name, String model, int price, int yearOfManafacture, EngineType engine) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManafacture = yearOfManafacture;
        this.engine = engine;
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

    public ArrayList<Manafacturer> getManufacturer() {
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
