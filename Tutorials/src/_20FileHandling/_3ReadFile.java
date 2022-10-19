package _20FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _3ReadFile {
    public static void main(String[] args) {
        File rFile = new File("MyFile.txt");
        try {
            Scanner sc = new Scanner(rFile);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
