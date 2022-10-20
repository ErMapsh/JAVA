package _21Java8Features._2StreamApi._1FunctionalInterface._1Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class _2ConsumerWithLambdaFun {
    public static void main(String[] args) {
        Consumer<Integer> c = (t) ->{
            System.out.println("Information is " + t);
        };

        c.accept(5);

        //----here is another example
        List<Integer> ls = Arrays.asList(1,2,3,4);
        ls.forEach(c);

        //---- we can also do this
        ls.stream().forEach((t) ->{System.out.println("Printing: " + t);});
    }
}
