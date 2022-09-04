package practice;
import java.util.Scanner;

public class _1Percentage {
    public static void main(String[] args){
        System.out.println("----Percentage----");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First subject marks: ");
        int a = sc.nextInt();
        System.out.print("Enter Second subject marks: ");
        int b = sc.nextInt();
        System.out.print("Enter Third subject marks: ");
        int c = sc.nextInt();
        System.out.print("Enter Fourth subject marks: ");
        int d = sc.nextInt();
        System.out.print("Enter Fifth subject marks: ");
        int e = sc.nextInt();

        double percentage = ((a+b+c+d+e)/500d) * 100d;
        System.out.print("Percentage: " + percentage);

        sc.close();
    }
}

