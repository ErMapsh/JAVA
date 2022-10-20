package _21Java8Features._2StreamApi._1FunctionalInterface._2Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class _2PredicateWithLambda {
    public static void main(String[] args) {
        Predicate <Integer> predicate = (t) -> t%2 == 0;

        List <Integer> ls = Arrays.asList(1,2,3,4,5,6);

        ls.stream().filter(predicate).forEach(t-> System.out.println("print Even: " + t));

        System.out.println();
        ls.forEach(t-> System.out.println("Print: "+t));
    }
}
