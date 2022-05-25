package io.codelex.Exceptions.practice;

import java.io.*;


public class Exercise3 {
    private static final String PATH = "C:\\Users\\Karlis\\Documents\\JAVA\\Codelex_March\\";

    public static void main(String[] args) throws IOException {

        RandomAccessFile input = null;
        String line = null;

        try {
            input = new RandomAccessFile("file.txt", "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (input != null) input.close();
        }

    }

}
