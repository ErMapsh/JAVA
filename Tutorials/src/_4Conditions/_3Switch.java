package _4Conditions;

import java.util.Scanner;

public class _3Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int a = sc.nextInt();

        /* ---Old way---
        */

        switch (a){

            case 18:
                System.out.println("You are going to become a adult");
                break;
            case 23:
                System.out.println("Yor are going to join a job");
                break;
            case 60:
                System.out.println("Yor are going to get retired");
                break;
            default:
                System.out.println("Invalid Choice.....");
                break;
        }


        // -----Enhance switch method----
        //        switch (a) {
        //            case 18 -> System.out.println("You are going to become a adult");
        //            case 23 -> System.out.println("Yor are going to join a job");
        //            case 60 -> System.out.println("Yor are going to get retired");
        //            default -> System.out.println("Invalid Choice.....");
        //        }


    }
}
