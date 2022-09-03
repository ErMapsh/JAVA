package practice;

import java.util.Scanner;

public class _4conditional {
    public static void main(String[] args) {
    /* 1. What will be the output

    //CODE:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int a = sc.nextInt();
        if (a == 10){
            System.out.println("I am 10");
        }else{
            System.out.println("I am not 10");
        }
    */

    /* 2. Write a program to find out where a student is pass or fail;
    if it requires total 40% and at least 33% in each subject to
    pass assume 3 subjects and take marks as an input from the
    user

    // CODE:
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first subject marks: ");
    int a = sc.nextInt();
    System.out.print("Enter the second subject marks: ");
    int b = sc.nextInt();
    System.out.print("Enter the third subject marks: ");
    int c = sc.nextInt();

    float avg = (a+b+c) / 3.0f;

    if (avg>=40 &&a>=33 && b>=33 && c>=33){
        System.out.println("Congratulations, You are pass with "+avg);
    }else {
        System.out.println("Sorry, Try again");
    }

    */

     /*  Calculate income for paid by employee to the  government as per the salary mentioned below

     2.5lkh - 5Lkh ---> 5%
     5lkh - 10Lkh ---> 20%
     above 10Lkh ---> 30%

     Note: There is no tax below 2.5L. take input amount as an input from the user

     //CODE:

     float tax = 0;
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the your salary (Note: 3,50,000 like 3.5) : ");
     float input = sc.nextFloat();

     if (input < 2.5f){
        System.out.println("You no need to pay a tax");
     } else {
       if (input > 2.5f && input <= 5f) {
             tax = (5 * input) / 100f;
         } else if (input > 5f && input <= 10f) {
             tax = (20 * input) / 100f;
         } else if (input > 10.0f) {
             tax = (30 * input) / 100f;
         }
           System.out.printf("You need to pay tax: %.2f", tax);
     }

     */


      /* 4.Write a java program to find out the day of the week given
      the number like 1 for monday'

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int day = sc.nextInt();

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3-> System.out.println("wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid Choice..");
        }

      */

        /* 5.Leap Year or not
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int year = sc.nextInt();

        if ( year % 4 == 0){
            System.out.printf("Yep %d is leap year", year);
        }else{
            System.out.println("Not Leap year..");
        }
      */

      /*
          6. write a program to find out the type of website from the url like com, org, in

      */
        Scanner sc = new Scanner(System.in);
        String url = sc.nextLine();

        String[] array = url.split("[.]");
        System.out.println("type of url is " + array[array.length-1]);

        //another way


        if (url.endsWith(".com")){
            System.out.println("This is Commercial website");
        } else if (url.endsWith(".live")) {
            System.out.println("This is Live website");
        } else if (url.endsWith(".org")) {
            System.out.println("This is Org website");
        } else if (url.endsWith(".in")) {
            System.out.println("This is indian website");
        }


    }
}
