package _20FileHandling;

import java.io.File;
import java.io.IOException;


public class _1CreatingFile {
    public static void main(String[] args) throws IOException {
        File cFile = new File("MyFile.txt");

        try {
            cFile.createNewFile();
            System.out.println("File created Successfully..");
        } catch (IOException e) {
            System.out.println("Unable to create file" + e);
            e.printStackTrace();
        }
    }
}
