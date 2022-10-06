package practice._14ErrorAndException;

import java.util.Scanner;

public class _3ArrayOutOfindex {
    public static void main(String[] args) {
        /* write a program that allows you to keep accessing
        an array until a valid index is give, if max retries exceed 5
        Print "Error"
        */

        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        Scanner sc = new Scanner(System.in);
        try {
            while (true) {
                System.out.print("Enter The index: ");
                int a = sc.nextInt();
                System.out.println(arr[a]);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error, occurs when index is not valid");
        }
    }
}
