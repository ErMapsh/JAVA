package _21Java8Features._3ForeachAndFilterMethod._1ForEach;

import java.util.HashMap;
import java.util.function.Consumer;

public class _2ForEachInMap {
    public static void main(String[] args) {
        HashMap<Integer, Character>  map = new HashMap<>();
        map.put(1, 'a');
        map.put(2, 'b');
        map.put(3, 'c');
        map.put(4, 'd');

        map.forEach((key, value)->{
            System.out.println(value+" "+ key);
        });

        System.out.println("\n");

        // using stream api
        map.entrySet().stream().forEach(obj -> System.out.println(obj));

    }
}
