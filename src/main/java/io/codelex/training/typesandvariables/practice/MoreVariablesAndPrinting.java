package io.codelex.training.typesandvariables.practice;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {
        String name;
        String eyes;
        String teeth;
        String hair;
        int age;
        int height;
        int weight;


        name = "Zed A. Shaw";
        age = 35;
        height = 74;  // inches
        BigDecimal heightToCm = new BigDecimal(height * 2.54).setScale(2, RoundingMode.HALF_UP);
        ;
        weight = 180; // lbs
        BigDecimal weightToKg = new BigDecimal(weight * 0.453592).setScale(2, RoundingMode.HALF_UP);
        eyes = "Blue";
        teeth = "White";
        hair = "Brown";

        System.out.println("Let's talk about " + name + ".");
        System.out.println("He's " + height + " inches tall.");
        System.out.println("He's " + weight + " pounds heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
        System.out.println("His teeth are usually " + teeth + " depending on the coffee.");

        System.out.println("If I add " + age + ", " + heightToCm + ", and " + weightToKg
                + " I get " + (age + height + weight) + ".");
    }
}