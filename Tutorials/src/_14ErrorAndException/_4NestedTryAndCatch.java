package _14ErrorAndException;

import java.util.Scanner;

public class _4NestedTryAndCatch {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;

        Boolean flag = true;
        Scanner sc = new Scanner(System.in);


        while (flag) {
            System.out.print("Enter the index: ");
            int a = sc.nextInt();

            try {
                try {
                    System.out.println(marks[a]); // array out of index
                    flag = false;
                } catch (Exception e) {
                    System.out.println("Exception level 2, Index does not exist");
                }
            } catch (Exception e) {
                System.out.println("Exception level 1");
            }
        }

        System.out.println("Thank u");
    }
}
