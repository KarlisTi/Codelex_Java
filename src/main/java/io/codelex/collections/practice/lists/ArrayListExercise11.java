package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements
        ArrayList<String> newList = new ArrayList<>();

        //TODO: Add 10 values to list
        newList.add("Audi");
        newList.add("BMW");
        newList.add("Skoda");
        newList.add("Subaru");
        newList.add("Mercedes");
        newList.add("Suzuki");
        newList.add("Honda");
        newList.add("Bugatti");
        newList.add("Porche");
        newList.add("Vaz");
        System.out.println(newList);
        //TODO: Add new value at 5th position
        newList.add(4, "Jeep");
        System.out.println(newList);

        //TODO: Change value at last position (Calculate last position programmatically)
        newList.set(newList.size() - 1, "Zaz");
        System.out.println(newList);
        //TODO: Sort your list in alphabetical order
        Collections.sort(newList);
        System.out.println(newList);
        //TODO: Check if your list contains "Foobar" element
        if (newList.contains("Foobar")) {
            System.out.println("I found Foobar");
        } else {
            System.out.println("Cant find Foobar");
        }
        //TODO: Print each element of list using loop
        for (String print : newList) {
            System.out.println(print);
        }
    }

}
