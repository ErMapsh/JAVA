package practice._14ErrorAndException;

import java.util.Scanner;

class IndeOutBound extends Exception {
    @Override
    public String toString() {
        return "not valid Index, bhai";
    }

    @Override
    public String getMessage() {
        return "not valid Index, bhai";
    }
}

public class _4CustomIndexException {
    public static void main(String[] args) {
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
                if (a >= 5) {
                    throw new IndeOutBound();
                }
                System.out.println(arr[a]);
            }
        } catch (IndeOutBound e) {
            System.out.println("Error " + e);
        }
    }
}
