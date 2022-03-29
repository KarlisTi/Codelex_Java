package io.codelex.collections.practice;

import java.io.*;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.List;


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
        chooseCity(scan, lines);

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
        HashSet<String> newCities = new HashSet();
        for (String city : lines) {
            if (!city.isEmpty()) {
                String[] splitedCities = city.split(" ->");
                newCities.add(String.valueOf(splitedCities[0]));
            }
        }
        return newCities;
    }

    public static void chooseCity(Scanner scan, List<String> lines) {
        ArrayList<String> newList = new ArrayList<>();
        ArrayList<String> nextList = new ArrayList<>();
        String inputCity;
        while (true) {
            System.out.println("Enter name of the city where you want to flight");
            inputCity = scan.next();
            for (String city : lines) {
                String[] newSet = city.split(" ->");
                if (inputCity.equals(newSet[0])) {
                    newList.add(newSet[1]);
                    break;
                }
            }

            for (String newCity : newList) {
                System.out.println("You can fly to: " + newCity);
            }
            while (true) {
                System.out.println("Choose flight to continue trip");
                String nextCity = scan.next();
                for (String nextFlight : lines) {
                    String[] nextSet = nextFlight.split(" ->");
                    if (nextCity.equals(nextSet[0])) {
                        nextList.add(nextSet[1]);
                        for (String nexcity : nextList) {
                            System.out.println("You can fly to: " + nexcity);
                        }
                        if (nextCity.equals(nextSet[0])) {
                            nextList.add(nextSet[1]);
                            for (String nexcity : nextList) {
                                System.out.println("You can fly to: " + nexcity);
                            }
                        } else if (nextCity.equals(inputCity)) {
                            System.out.println("You chosen round trip route");
                            break;
                        }
                    }
                }
            }
        }

    }
}










