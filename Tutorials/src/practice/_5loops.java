package practice;

import java.util.Scanner;

public class _5loops {
    public static void main(String[] args) {
        System.out.println("----Loops practice set----");

        Scanner sc = new Scanner(System.in);

        /* 1.Following pattern

        * * * *
        * * *
        * *
        *

        code:

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        OR

        int n = 4;
        for(int i = n; i > 0 ; i--){
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        */

        /* 2.
        int sum = 0;
        int n = 4;
        for (int i = 0; i < n; i++) {
            sum = sum + (2*i);
        }
        System.out.println(sum);
        */


        /* 3.Multiplication table

        int tn = 5;
        for (int i = 0; i < 10 ; i++) {
            System.out.println((i+1) * tn);
        }
        */

        /* 4. Multiplication table in reverse order

        for (int i = 10; i > 0; i--) {
            System.out.println(i*5);
        }
        */

        /* 5. Factorial of a given number using loop

        int fact = 1;
        for (int i = 5; i > 1; i--) {
            fact = fact * i;
        }
        System.out.println(fact);
        */

        /* 6.repeat 5 using while loop

        int i = 0;
        while (i< 5){
            System.out.println(5);
            i++;
        }
        */

        /* 9. write a program to calculate the sum of the numbers occuring in multiplication table of 8

        int sum = 0;
        int num = 8;
        for (int i = 0; i < 10; i++) {
            sum = sum + ((i+1)* num);
        }
        System.out.println(sum);
        */

        /* 10. A do while loop executed
            1--> at least once
            2--> at least twice
            3--> at most once
        */

        int i = 0;
        do {
            System.out.println(4);
            i++;
        } while ( i < 2);

        sc.close();
    }
}
