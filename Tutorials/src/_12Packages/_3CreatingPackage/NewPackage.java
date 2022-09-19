package _12Packages._3CreatingPackage;


// ---- using java class packages---
// import java.util.Scanner; // importing Scanner package
import java.util.*; // importing all packages that java have

/*
    creating own packages
    ---->  javac -d  *.java ----> saying to create a java packages to belonging thier statement 
    and after that class file will create in that package, thats is package called
*/


public class NewPackage {
    public void state(){
        System.out.println("Fcukoff everyone......");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.println("a is " + a);
        sc.close();
    }
}
