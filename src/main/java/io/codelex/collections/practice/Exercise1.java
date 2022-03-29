package io.codelex.collections.practice;

import java.util.*;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};

        //todo - replace array with an ArrayList and print out the results
        ArrayList<String> asArrayList = new ArrayList<>();
        for (String setNew : array) {
            asArrayList.add(setNew);
        }
        System.out.println(asArrayList);

        //todo - replace array with a HashSet and print out the results
        HashSet<String> asHasSet = new HashSet<>();
        for (String setNew : array) {
            asHasSet.add(setNew);
        }
        System.out.println(asHasSet);

        //todo - replace array with a HashMap (use brand as key and origination as value) an print out the results
        HashMap<String, String> hasMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            hasMap.put(String.valueOf(i), array[i]);
        }
        System.out.println(hasMap);
    }
}

