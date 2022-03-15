package io.codelex.arrays.practice;

import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] listOfWords = {"building", "river", "road"};
        String guessedLetters = "";
        String missedLetters ="";
        String chooseWord = listOfWords[new Random().nextInt(listOfWords.length)];

        while(true){
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println();
            System.out.println("Word: ");
            printOutWord(chooseWord, guessedLetters);
            System.out.println();
            System.out.println("Misses:");
            System.out.println(missedLetters);
            if(missedLetters.length()>=10){
                System.out.println("You loose the game");
            }

            System.out.println();
            System.out.println("Guess: ");

            char inputChar = scan.nextLine().charAt(0);

            if( chooseWord.contains(String.valueOf(inputChar))) {
                guessedLetters += inputChar;
            } else {
                missedLetters +=inputChar;
            }
           
            if(guessedLetters.equals(chooseWord)){
                System.out.println("You won the game");
                System.out.println("Guessed word is: ");
                printOutWord(chooseWord, guessedLetters);
                break;
            }
        }
    }
    
    public static void printOutWord(String word, String guessedLetters) {
        for (int i = 0; i < word.length(); i++) {
            if (guessedLetters.contains(String.valueOf(word.charAt(i)))){
                System.out.print(word.charAt(i)+" ");
            } else{
                System.out.print("_ ");
            }
        }
    }
}
