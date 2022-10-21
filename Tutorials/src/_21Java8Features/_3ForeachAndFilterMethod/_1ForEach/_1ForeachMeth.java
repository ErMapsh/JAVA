package _21Java8Features._3ForeachAndFilterMethod._1ForEach;

import java.util.ArrayList;
import java.util.function.Consumer;

public class _1ForeachMeth {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("mahesh");
        a.add("er");
        a.add("mapsh");
        a.add("ermapsh");
        //System.out.println(a);

        for (String i: a) {
            System.out.println(i);
        }

        System.out.println("\n");

        // --- using stream api
        a.stream().forEach((t)->{
            System.out.println(t);
        });

        System.out.println("\n");

        // actually happend like this
        Consumer<String> consumer = (t) -> System.out.println("This is string in consumer function and consumer never return anything");
        for (String i: a) {
            consumer.accept(i);
        }

    }
}
