package _21Java8Features._2StreamApi._1FunctionalInterface._3Supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class _1Supplier implements Supplier<String> {

    @Override
    public String get() {
        return "LearnErMapsh";
    }

    public static void main(String[] args) {
        Supplier <String> supplier = new _1Supplier();
        supplier.get();

        List<String> ls = Arrays.asList("Mahesh", "ErMapsh", "LearnErMapsh");
        
    }
}
