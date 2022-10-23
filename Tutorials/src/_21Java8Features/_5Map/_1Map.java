package _21Java8Features._5Map;

import java.util.*;
import java.util.Map.Entry;
import java.util.Collections;

class MyCmp implements Comparator<Map<String, Integer>>{

    @Override
    public int compare(Map<String, Integer> o1, Map<String, Integer> o2) {
        return 0;
    }
}


public class _1Map  {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("five", 5);
        map.put("two", 2);
        map.put("four", 4);
        map.put("three", 3);
        System.out.println(map);


        // so here we have to the list to manipulate map
        Map<String, Integer> newMap = map;
        List<Entry<String, Integer>> NewMapList = new ArrayList<>(map.entrySet());
        List<Entry<String, Integer>> NewMapList1 = new ArrayList<>(map.entrySet());

        Collections.sort(NewMapList, new Comparator<Entry<String, Integer>>(){
            @Override
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        NewMapList.forEach(t-> System.out.println(t));
        System.out.println("\n");

        // using lambda
        Collections.sort(NewMapList1, Comparator.comparing(Entry::getValue));
        NewMapList1.forEach(t-> System.out.println(t));

        // Using stream api
        System.out.println(map);
        System.out.println("\nconverting Hashnamp into like list: "+map.entrySet() + "\n");// converting into like list for manipulation

        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(t-> System.out.println(t));
        System.out.println("==========");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(t-> System.out.println(t));



    }
}
