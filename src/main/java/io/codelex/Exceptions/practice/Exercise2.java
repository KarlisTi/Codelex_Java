package io.codelex.Exceptions.practice;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        methodA();

    }

    public static void methodA() throws ArithmeticException {
        try {
            methodB();
        } catch (ArithmeticException e) {
            System.out.println("methodB called");
        }
    }

    public static void methodB() throws ArithmeticException {
        try {
            methodC();
        } catch (ArithmeticException e) {
            System.out.println("methodC called");
        }
    }

    public static void methodC() throws ArithmeticException {
        int numOne = 6;
        int numTwo = 6;
        int result;
        try {
            result = numOne / numTwo;
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero");
        }
    }
}