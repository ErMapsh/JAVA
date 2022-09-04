package _4Conditions;

import java.util.Scanner;

public class _2Else_if {
    public static void main(String[] args) {
        System.out.println("----Else if Clause----");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();

        if (a == 1){
            System.out.println("Yes its 1");
        }else if (a == 2){
            System.out.println("Yes its 2");
        }else{
            System.out.println("Not at all");
        }
        sc.close();
    }
}
