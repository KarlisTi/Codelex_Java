package io.codelex.oop.Computers;

import java.util.Objects;

public class Computer {
    private String processor;
    private String ram;
    private String graphicCard;
    private String company;
    private String model;

    public Computer(String processor, String ram, String graphicCard, String company, String model) {
        this.processor = processor;
        this.ram = ram;
        this.graphicCard = graphicCard;
        this.company = company;
        this.model = model;
    }


    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return processor.equals(computer.processor) && ram.equals(computer.ram) && graphicCard.equals(computer.graphicCard) && company.equals(computer.company) && model.equals(computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, ram, graphicCard, company, model);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", graphicCard='" + graphicCard + '\'' +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
