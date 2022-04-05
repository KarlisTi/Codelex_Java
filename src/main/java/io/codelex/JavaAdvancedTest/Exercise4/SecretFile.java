package io.codelex.JavaAdvancedTest.Exercise4;

import java.io.*;

import static org.apache.commons.lang3.StringUtils.reverse;


public class SecretFile {


    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("/home/karlis/Desktop/JAVA/Codelex_March/src/main/java/io/codelex/JavaAdvancedTest/Exercise4/secretFile.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("/home/karlis/Desktop/JAVA/Codelex_March/src/main/java/io/codelex/JavaAdvancedTest/Exercise4/NewSecretFile.txt"));
            String s;
            while ((s = reader.readLine()) != null) {
                writer.write(reverse(s));
            }
            writer.close();
            reader.close();
        } catch (Exception e) {
            System.out.println("An error occurred");
        }

    }
}
