package io.codelex.oop.Cars;

import java.util.Objects;

public class Manafacturer {
    String name;
    int yearEstablishment;
    String country;

    public Manafacturer(String name, int yearOfEstablishment, String country) {
        this.name = name;
        this.yearEstablishment = yearOfEstablishment;
        this.country = country;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manafacturer)) return false;
        Manafacturer that = (Manafacturer) o;
        return yearEstablishment == that.yearEstablishment && name.equals(that.name) && country.equals(that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearEstablishment, country);
    }
}
