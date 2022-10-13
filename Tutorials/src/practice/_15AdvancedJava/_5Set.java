package practice._15AdvancedJava;

import java.util.HashSet;

public class _5Set {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(1);
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        hs.add(7);
        hs.add(7);
        hs.add(7);

        for (Object o : hs) {
            System.out.println(o);
        }

        System.out.println("\n" + hs);
    }
}
