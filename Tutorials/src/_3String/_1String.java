package _3String;

import java.util.Scanner;

public class _1String {
    public static void main(String[] args) {
        System.out.println("-----Strings------");
        /* String is immutable in java */

        /*
        String str = new String("ErMapsh");
        System.out.println(str);
        */

        /*  ----- but java make it simple, we can also use string as datatype ----*/
        String name = "ErMapsh";
        name = "Mapsh";
        System.out.println("Name is " + name);

        // string
        int a = 3;
        float f = 3.333f;
        System.out.printf("The value of int is %d and value of float is %.4f \n",a, f);// .4 means show 4 digit after decimal point
        System.out.format("The value of int is %d and value of float is %8.2f",a, f);//include 8 space in float number
        /*
            formatter specifier =  %d, %f, %s, %c,
            both printf and format are work same
        */

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(str);
        
        sc.close();

    }
}
