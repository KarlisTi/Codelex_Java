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
            e.printStackTrace();
            throw e;
        }
    }

    public static void methodB() throws ArithmeticException {
        try {
            methodC();
        } catch (ArithmeticException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void methodC() throws ArithmeticException {
        int numOne = 6;
        int numTwo = 0;
        int result;
        try {
            result = numOne / numTwo;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("You can't divide by zero");
        }
    }
}
