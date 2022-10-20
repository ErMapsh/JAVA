package _21Java8Features._2StreamApi._1FunctionalInterface._1Consumer;

import java.util.function.Consumer;

public class _1ConsumerDemo implements Consumer <Integer> {
    @Override
    public void accept(Integer t) {
        System.out.println("Information is " + t);
    }

    public static void main(String[] args) {
        new _1ConsumerDemo().accept(5);
    }
}
