package _15AdvancedJava._4Hashing._1Hashset;

import java.util.HashSet;

public class _1Hashset {
    public static void main(String[] args) {
        /*
            https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/HashSet.html
         */

        HashSet<Integer> hs = new HashSet<>(); // Constructs a new, empty set; the backing HashMap instance has default initial capacity (16) and load factor (0.75).

        HashSet<Integer> hs1 = new HashSet<>(); // Constructs a new, empty set; the backing HashMap instance has the specified initial capacity and default load factor (0.75).

        HashSet<Integer> hs2 = new HashSet<>(100, 0.5f); // custom capacity and load factor

        // adding element
        hs2.add(1);
        hs2.add(2);
        hs2.add(3);
        hs2.add(4);
        hs2.add(11);
        hs2.add(1); // set has collection of unique value, so its will not work

        // two-way to print
        System.out.println(hs2);
        System.out.println(hs2.clone());

        // size
        System.out.println(hs2.size());

        //remove
        hs2.remove(11);
        System.out.println("After removing Element 11: " + hs2);

        // is content
        System.out.println("4 is there : " + hs2.contains(4));
    }
}
