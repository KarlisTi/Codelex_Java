package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet<String> names = new HashSet<>();
        String result;
        while (true) {
            System.out.print("Enter name:");
            String newInput = scan.nextLine();
            names.add(newInput);
            if (newInput.isEmpty()) {
                result = String.join(" ", names);
                System.out.println("Unique name list contains:" + result);
                break;
            }
        }

    }
}
