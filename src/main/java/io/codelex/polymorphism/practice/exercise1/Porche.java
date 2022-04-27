package io.codelex.polymorphism.practice.exercise1;

public class Porche implements Car {

    private Integer currentSpeed = 0;

    public Porche(Integer currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public Integer getCurrentSpeed() {
        return currentSpeed;
    }

    @Override
    public void speedUp() {
        currentSpeed += 12;
    }

    @Override
    public void slowDown() {
        currentSpeed += 12;
    }

    @Override
    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    @Override
    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }

    @Override
    public String toString() {
        return "Porche{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }
}
