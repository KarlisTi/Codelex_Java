package io.codelex.arrays.practice;

import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] listOfWords = {"building", "river", "road"};

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println();
        System.out.println("Word: ");
        hiddenWord(listOfWords);
        System.out.println();
        System.out.println("Misses:");
        char[] missedWords = {};
        System.out.println();
        System.out.println("Guess: ");

        char inputChar = scan.next().charAt(0);
        int tries = 10;
    }
    public static void hiddenWord(String[] words) {
        String chooseWord = words[(int) (Math.random() * words.length)];
        char[] wordToLetters = chooseWord.toCharArray();
        for (char i = 0; i < wordToLetters.length; i++) {
            System.out.print( wordToLetters[i] = '_');
        }
    }
}