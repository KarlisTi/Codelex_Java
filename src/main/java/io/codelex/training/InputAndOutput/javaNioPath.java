package io.codelex.training.InputAndOutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class javaNioPath {

    private static final String PATH_TO_APP = "C:\\Users\\Karlis\\Documents\\JAVA\\Codelex_March\\src\\main\\java\\io\\codelex\\training\\InputAndOutput";

    public static void main(String[] args) throws IOException {
        Path path = Paths.get(PATH_TO_APP + "myOtherFile2.txt");
        Files.createFile(path);
        Files.write(path, "I will start with one line. ".getBytes(), StandardOpenOption.WRITE);
        Files.write(path, "Then I will add some text. ".getBytes(), StandardOpenOption.APPEND);
        Files.write(path, "And then the third text with new line at the end....\n".getBytes(), StandardOpenOption.APPEND);
        for (String line : Files.readAllLines(path)) {
            System.out.println(line);
        }
        Files.delete(path);
    }

}
