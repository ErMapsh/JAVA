package _20FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class _2WritingFile {
    public static void main(String[] args) {
        try {
            FileWriter wFile = new FileWriter("MyFile.txt");
            wFile.write("This is my file and writing a file\nThis is second sentence of file\n");
            wFile.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
