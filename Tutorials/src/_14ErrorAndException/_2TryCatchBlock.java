package _14ErrorAndException;

import java.util.Scanner;

public class _2TryCatchBlock {
    public static void main(String[] args) {

        // syntax error
        try {
            //a = 1; // syntax error ---> developer easily can see
            int a = 3;
        } catch (Exception e) {
            System.out.println("Syntax error");
        }

        // logical error
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]); // here we got error, index out range
        } catch (Exception e) {
            assert System.out != null;
            System.out.println("Index out of range--> " + e);
        }

        // runtime error
        try {
            System.out.print("Enter the number: ");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();

            if (a > 18) {
                System.out.println("You can now vote");
            } else {
                System.out.println("You cant");
            }
        } catch (Exception e) {
            System.out.println("Input must be Number");
        }
    }
}
