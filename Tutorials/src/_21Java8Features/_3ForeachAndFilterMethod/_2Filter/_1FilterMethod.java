package _21Java8Features._3ForeachAndFilterMethod._2Filter;

import java.util.ArrayList;

public class _1FilterMethod {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("mahesh");
        a.add("er");
        a.add("mapsh");
        a.add("ermapsh");

        // traditional things
        for (String i: a) {
            if(i.startsWith("m")){
                System.out.println(i);
            }
        }

        System.out.println("\n");

        // let's do this thing with stream api
        a.stream().filter((t)-> t.startsWith("m")).forEach(t-> System.out.println(t));
        /*
            first of all, the filter method work on arraylist and filter the element and then populate it
        */
    }
}
