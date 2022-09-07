package practice;

import java.util.Random;
import java.util.Scanner;

class Guess{
    // private boolean flag;
    private int randomNumber;
    Random r = new Random();

    Guess(){
        this.randomNumber = r.nextInt(1, 5);
    }

    public int GuessTheNumber(int x){
        if(x == randomNumber){
            return 1;
        }
        System.out.println(randomNumber);
        return 0 ;
    }
}
public class _8GuessTheNum {
    public static void main(String[] args) {
        System.out.println("----Guess the number----");
        Scanner sc = new Scanner(System.in);
        int choice;
        while(true){
            Guess user = new Guess();
            System.out.print("Enter the your guess: ");
            choice = sc.nextInt();
            if(choice>=1 && choice<=5){
                if(user.GuessTheNumber(choice) == 1){
                    System.out.println("Congrats..., number is "+ choice);
                    break;
                }
            }else{
                System.out.println("Enter correct choice....");
            }
            
        } 

        sc.close();

}}
