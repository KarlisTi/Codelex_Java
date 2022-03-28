package io.codelex.collections.practice;


import io.codelex.training.streamAPI.Song;

import java.awt.*;
import java.io.*;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;


public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        Files.readAllLines(path, charset);
        List<String> lines = Files.readAllLines(path, charset);
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        HashSet<String> cities = new HashSet<>();
        boolean chosenNumber = false;

        boolean chosenValue = welcome(scan, chosenNumber);
        System.out.println("List of cities ");
        if (chosenValue) {
            cities = listOfCities(lines);
            for (String city : cities) {
                System.out.println(city);
            }
        }
        System.out.println(chooseCity(scan, lines));

    }

    public static boolean welcome(Scanner scan, boolean chosenNumber) {
        boolean setNumber = chosenNumber;
        while (true) {
            System.out.println("Welcome to flight planner");
            System.out.println("To display list of cities pres 1");
            System.out.println("To exit a program press #");
            String input = scan.nextLine();
            if (!(input.equals("1") || input.equals("#"))) {
                System.out.println("Invalid input, enter: 1 or #");
            } else if (input.equals("#")) {
                System.out.println("You quited a program");
                break;
            } else if (input.equals("1")) {
                setNumber = true;
                break;
            }

        }
        return setNumber;
    }


    public static HashSet<String> listOfCities(List<String> lines) {
        HashSet<String> newCities = new HashSet<>();
        for (String line : lines) {
            String[] res = line.split(" -> ");
            newCities.add(res[0]);
        }
        return newCities;
    }

    public static ArrayList<String> chooseCity(Scanner scan, List<String> lines) {
        ArrayList<String> newList = new ArrayList<>();
        System.out.println("Enter name of the city where you whant to flight");
        String inputCity = scan.next();
        for (String city : lines) {
            String[] newSet = city.split(" ->");
            if (inputCity.equals(newSet[0])) {
                newList.add(newSet[1]);
            }
        }
        return newList;
    }
}







