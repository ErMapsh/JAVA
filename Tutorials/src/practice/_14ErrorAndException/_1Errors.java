package practice._14ErrorAndException;

import java.util.Scanner;

public class _1Errors {
    public static void main(String[] args) {

        /* 1.Demonstrate Errors */

        // ------syntax error------
        // int a = 4

        // ------logical error------
        int age = 21;
        if (age > 18) {
            // here user age is greater than 18 but result is shows wrong
            System.out.println("You can't vote");
        }

        // ------Runtime error------
        Scanner sc = new Scanner(System.in);
        System.out.print("Print Fist number: ");
        int d = sc.nextInt();
        System.out.print("Print Second number: ");
        int e = sc.nextInt();
        System.out.println(d / e); // here we got exception as Arithmetic if e is 0;
    }
}
