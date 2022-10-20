package _21Java8Features._2StreamApi._1FunctionalInterface._3Supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class _2SupplierDemo {
    public static void main(String[] args) {
        Supplier <String> obj = ()->{
            return "LearnErMapsh";
        };

        System.out.println(obj.get());

        List <String> ls = Arrays.asList("Mahesh", "ErMapsh", "LearnErMapsh");
        System.out.println( ls.stream().findAny().orElseGet(obj));
        // here is we saying there is anything in ls, then get it, return that data else return supplier data
    }
}
