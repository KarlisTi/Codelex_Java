package io.codelex.Exceptions.practice;

import java.io.*;


public class Exercise3 {
    private static final String PATH = "C:\\Users\\Karlis\\Documents\\JAVA\\Codelex_March\\src\\main\\java\\io\\File\\";

    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream(PATH + "file.txt");
        FileOutputStream out = new FileOutputStream(PATH + "file.txt");

        RandomAccessFile input = null;
        String line = null;

        try {
            input = new RandomAccessFile("file.txt", "rw");
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
