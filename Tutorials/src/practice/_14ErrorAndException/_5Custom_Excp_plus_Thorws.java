package practice._14ErrorAndException;


import java.util.Scanner;

class IndeOutBound1 extends Exception {
    @Override
    public String toString() {
        return "not valid Index, bhai";
    }

    @Override
    public String getMessage() {
        return "not valid Index, bhai";
    }
}


public class _5Custom_Excp_plus_Thorws {
    public static void nor() throws IndeOutBound1 {
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
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }

    public static void main(String[] args) throws IndeOutBound1 {
        // problem - 5
        try {
            nor(); // this function throws index out of range error

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
