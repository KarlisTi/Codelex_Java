package io.codelex.oop.Computers;

import java.util.Objects;

public class Laptops extends Computer {

    private String battery;


    public Laptops(String processor, String ram, String graphicCard, String company, String model, String battery) {
        super(processor, ram, graphicCard, company, model);
        this.battery = battery;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    @Override
    public String getProcessor() {
        return super.getProcessor();
    }

    @Override
    public void setProcessor(String processor) {
        super.setProcessor(processor);
    }

    @Override
    public String getRam() {
        return super.getRam();
    }

    @Override
    public void setRam(String ram) {
        super.setRam(ram);
    }

    @Override
    public String getGraphicCard() {
        return super.getGraphicCard();
    }

    @Override
    public void setGraphicCard(String graphicCard) {
        super.setGraphicCard(graphicCard);
    }

    @Override
    public String getCompany() {
        return super.getCompany();
    }

    @Override
    public void setCompany(String company) {
        super.setCompany(company);
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptops laptops = (Laptops) o;
        return super.equals(o) && battery.equals(laptops.battery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), battery);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
