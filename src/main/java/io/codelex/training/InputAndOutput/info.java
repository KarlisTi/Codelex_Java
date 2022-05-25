package io.codelex.test.InputAndOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class info {

    private static final String PATH_TO_APP = "C:\\Users\\Karlis\\Documents\\JAVA\\Codelex_March\\src\\main\\java\\io\\codelex\\training\\InputAndOutput";

    public static void main(String[] args) throws IOException {

        FileInputStream in = new FileInputStream(PATH_TO_APP + "myFile.txt");
        FileOutputStream out = new FileOutputStream(PATH_TO_APP + "myOtherFile.txt");

        int data;
        while ((data = in.read()) != -1) {
            out.write(data);
        }

        in.close();
        out.close();
    }

}
