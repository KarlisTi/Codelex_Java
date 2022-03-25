package io.codelex.collections.practice;

import java.io.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/main/java/io/codelex/collections/practice/lear.txt");
        Scanner scan = new Scanner(file);
        FileReader readFile = new FileReader(file);
        BufferedReader readBuffer = new BufferedReader(readFile);
        int lineCounter = 0;
        int wordCounter = 0;
        int charCounter = 0;
        char[] newChar = scan.nextLine().toCharArray();

        String[] words = null;
        String textWhitoutWhitespaces = null;
        String newString = null;
        while (scan.hasNextLine()) {
            scan.nextLine();
            lineCounter++;
        }
        System.out.println("Lines = " + lineCounter);

        while ((newString = readBuffer.readLine()) != null) {
            words = newString.split(" ");
            wordCounter += words.length;
            textWhitoutWhitespaces = newString.replaceAll(" ", "");
            charCounter += textWhitoutWhitespaces.length();
        }
        System.out.println("Words = " + wordCounter);
        System.out.println("Chars = " + charCounter);

        charOrLetter(newChar);
    }

    private static void charOrLetter(char[] newChar) {
        for (int i = 0; i < newChar.length; i++) {
            System.out.println(Character.isLetterOrDigit(newChar[i]));
        }
    }
}


