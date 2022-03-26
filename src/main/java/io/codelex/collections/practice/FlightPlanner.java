package io.codelex.collections.practice;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/io/codelex/collections/flights.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());

        Files.readAllLines(path, charset);

        Scanner scan = new Scanner(System.in, file);
        List<String> cities = Files.readAllLines(path);
        System.out.println(cities);


        while (true) {
            System.out.println("What would you like to do: ");
            System.out.println("To display list of the cities press 1");
            int firstChoice = scan.nextInt();
            switch (firstChoice) {
                case 1:
                    // Display cities and chooce city mehthod
                    break;
                case 2:
                    // choose method two
                    break;
            }

//            private void cities () {


        }

    }

}

