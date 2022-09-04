package com._4UserInput;
import java.util.Scanner;


public class userInput {
    public static void main(String[] args){
        /* here Scanner is class that have utilities to get input */
        System.out.println("----User Input----");// we can also write short-form sout for System.out.print

        Scanner sc = new Scanner(System.in);

        /*
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();
        System.out.print("Enter the string: ");
        String str = sc.next();

        int sum = a + b;
        System.out.println(str+" "+sum);
        */

        System.out.println(sc.hasNextInt());

        System.out.println(sc.nextLine());

        sc.close();
    }
}
