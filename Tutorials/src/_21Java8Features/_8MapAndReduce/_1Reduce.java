package _21Java8Features._8MapAndReduce;

import java.util.Arrays;
import java.util.List;

public class _1Reduce {
    public static void main(String[] args) {

        List<Integer> ls = Arrays.asList(1, 2, 3, 4 ,5);

        // iterative approach --> Its so lengthy, so in Java8 introduce reduce()
        int sum = 0;
        for (int i: ls){
            sum += i;
        }
        System.out.println(sum);

        // with another method
        System.out.println(ls.stream().mapToInt(i -> i).sum());

        // with reduce;
        System.out.println(ls.stream().reduce(0, (a, b)-> a+b));

        Integer MaxValue = ls.stream().reduce(0, (a, b)-> a>b?a:b);
        System.out.println(MaxValue);
    }
}
