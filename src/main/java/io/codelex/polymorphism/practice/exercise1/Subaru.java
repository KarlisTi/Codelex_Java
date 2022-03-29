package io.codelex.polymorphism.practice.exercise1;

public class Subaru implements Car, Boost {
    private Integer currentSpeed = 0;

    public Subaru() {

    }

    @Override
    public void speedUp() {
        currentSpeed += 15;
    }

    @Override
    public void slowDown() {
        currentSpeed += 15;
    }

    @Override
    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    @Override
    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 30;
    }

    @Override
    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }
}
