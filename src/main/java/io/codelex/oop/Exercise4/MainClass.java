package io.codelex.oop.Exercise4;

import io.codelex.training.pizza.Main;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);
        System.out.println("Input time of marathon run");
        int inputTime = newScan.nextInt();
        Runner.getFitnessLevel(inputTime);

    }
}
