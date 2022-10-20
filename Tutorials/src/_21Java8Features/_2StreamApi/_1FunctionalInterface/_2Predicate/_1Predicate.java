package _21Java8Features._2StreamApi._1FunctionalInterface._2Predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class _1Predicate implements Predicate<Integer> {

    @Override
    public boolean test(Integer integer) {
        if(integer % 2 == 0){
            return  true;
        }
        return false;
    }

    public static void main(String[] args) {
        // using class way
        Predicate<Integer> obj = new _1Predicate();
        System.out.println(obj.test(5));

        // another Lambda way
        Predicate <String> name = (username) ->{
            if (username.equals("ErMapsh")){
                return true;
            }else{
                return false;
            }
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String userName = sc.nextLine();

        System.out.println(name.test(userName));
    }
}
