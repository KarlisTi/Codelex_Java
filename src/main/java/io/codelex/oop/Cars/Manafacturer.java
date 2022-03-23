package io.codelex.oop.Cars;

import java.util.Objects;

public class Manafacturer {
    String CompanyName;
    int yearEstablishment;
    String country;

    public Manafacturer(String name, int yearOfEstablishment, String country) {
        this.CompanyName = name;
        this.yearEstablishment = yearOfEstablishment;
        this.country = country;
    }

    public int getYearEstablishment() {
        return yearEstablishment;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manafacturer)) return false;
        Manafacturer that = (Manafacturer) o;
        return yearEstablishment == that.yearEstablishment && CompanyName.equals(that.CompanyName) && country.equals(that.country);
    }


    @Override
    public int hashCode() {
        return Objects.hash(CompanyName, yearEstablishment, country);
    }

    @Override
    public String toString() {
        return "Manafacturer{" +
                "name='" + CompanyName + '\'' +
                ", yearEstablishment=" + yearEstablishment +
                ", country='" + country + '\'' +
                '}';
    }
}
