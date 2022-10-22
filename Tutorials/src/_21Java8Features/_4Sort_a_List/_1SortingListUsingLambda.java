package _21Java8Features._4Sort_a_List;

import java.util.*;

public class _1SortingListUsingLambda {
    public static void main(String[] args) {

        List <Integer>  ls = new ArrayList<>();
        ls.add(5);
        ls.add(1);
        ls.add(16);
        ls.add(2);
        ls.add(55);

        System.out.println(ls);

        Collections.sort(ls);
        System.out.println(ls);

        Collections.reverse(ls);
        System.out.println(ls);

        System.out.println("\n");

        // with stream api
        ls.stream().sorted().forEach(t-> System.out.println(t));
        System.out.println("\n");
        ls.stream().sorted(Comparator.reverseOrder()).forEach(t-> System.out.println(t));

    }
}
