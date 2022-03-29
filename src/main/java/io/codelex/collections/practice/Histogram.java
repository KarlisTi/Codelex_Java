package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Histogram<listOfScores> {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";

    public static <listOfScores> void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();
        String[] newString = scores.split(" ");
        int[] histogram = new int[11];

        for (String set : newString) {
            int num = Integer.parseInt(set);
            int inRange = (num) / 10;
            histogram[inRange] = histogram[inRange] + 1;
        }
        for (int i = 0; i < 11; i++) {
            System.out.print("\n" + ((i) + "0") + " - " + ((i) + "9") + " : ");
            for (int j = 0; j < histogram[i]; j++) {
                System.out.print("*");
            }


        }

    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }
}
