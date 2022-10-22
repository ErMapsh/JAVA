package _21Java8Features._5Map;

import java.util.HashMap;
import java.util.Map;

public class _1Map  {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        System.out.println(map);
    }
}
