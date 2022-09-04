package _4Conditions;

import java.util.Scanner;

public class _1IfElse {
    public static void main(String[] args) {
        System.out.println("----Conditions----");
        /* comparison operators also called as relational operators
            in Java, if condition only satisfy with  true and false.

            <, >, <=, >=, ==, !=
        */

        /*
            Logical Operations: works with boolean
            &&, ||, !  ----> (and, or, not)
        */

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 18){
            System.out.println("You can go ahead");
        }else {
            System.out.println("You can't go ahead");
        }

        sc.close();
    }
}
