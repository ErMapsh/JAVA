package _20FileHandling;

import java.io.File;

public class _4DeleteFile {
    public static void main(String[] args) {
        File dFile = new File("MyFile1.txt");

        if (dFile.delete()) {
            System.out.println("I have deleted " + dFile.getName());
        } else {
            System.out.println("Something wrong with file");
        }
    }
}
