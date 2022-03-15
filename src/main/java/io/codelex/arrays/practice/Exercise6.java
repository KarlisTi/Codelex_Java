package io.codelex.arrays.practice;

import java.util.ArrayList;
import java.util.Random;

public class Exercise6 {
    public static void main(String[] args) {
        ArrayList<Integer> tenIntegers = new ArrayList<Integer>();
        ArrayList<Integer> anotherTenIntegers = new ArrayList<Integer>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100) + 1;
            tenIntegers.add(randomNumber);
            anotherTenIntegers.add(randomNumber);

        }

        tenIntegers.set(tenIntegers.size() - 1, -7);
        System.out.println(tenIntegers);
        System.out.println(anotherTenIntegers);
    }
}
