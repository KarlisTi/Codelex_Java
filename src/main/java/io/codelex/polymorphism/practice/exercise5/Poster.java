package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {
    String dimesions;
    int numberOfCopies;
    int costsPerCopy;


    public Poster(int fee, String dimesions, int numberOfCopies, int costsPerCopy) {
        super(fee);
        this.dimesions = dimesions;
        this.numberOfCopies = numberOfCopies;
        this.costsPerCopy = costsPerCopy;
    }

    @Override
    public int cost() {
        return super.cost() + costsPerCopy * numberOfCopies;
    }

    @Override
    public String toString() {
        return super.toString()
                + " Poster ad: number of copies. " + numberOfCopies + "."
                + " Costs per copy: " + costsPerCopy + "."
                + " Dimensions: " + dimesions;
    }
}
