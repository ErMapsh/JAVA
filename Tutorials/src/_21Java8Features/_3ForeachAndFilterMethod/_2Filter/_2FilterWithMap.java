package _21Java8Features._3ForeachAndFilterMethod._2Filter;

import java.util.HashMap;

public class _2FilterWithMap {
    public static void main(String[] args) {
        HashMap<Integer, Character> map = new HashMap<>();
        map.put(1, 'a');
        map.put(2, 'b');
        map.put(3, 'c');
        map.put(4, 'd');
        map.put(5, 'e');

        map.entrySet().stream().filter(t -> t.getKey()%2 == 0).forEach(t-> System.out.println(t));
    }
}
