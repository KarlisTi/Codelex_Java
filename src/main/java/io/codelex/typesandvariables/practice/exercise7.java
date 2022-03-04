package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class exercise7 {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        String inputWord = word.next();
        System.out.println("type word");
        int inputLenght = inputWord.length();
        int upperCaseLetters = 0;
        for (int i = 0; i < inputLenght; i++) {
            char ch = inputWord.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                upperCaseLetters++;
            }
        }
        System.out.println(upperCaseLetters);
    }
}

