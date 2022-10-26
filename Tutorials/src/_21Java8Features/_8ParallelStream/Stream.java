package _21Java8Features._8ParallelStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Stream {
    public static void main(String[] args) {

        long start = 0;
        long end = 0;


        start = System.currentTimeMillis();
        IntStream.range(1, 300).forEach(t -> System.out.print(t + " "));
        end = System.currentTimeMillis();
        System.out.println("\nTime taken by sequential method: " + (end - start));

        System.out.println("\n\n===========");
        start = System.currentTimeMillis();
        IntStream.range(1, 300).parallel().forEach(t -> System.out.print(t + " "));
        end = System.currentTimeMillis();
        System.out.println("\nTime taken by parallel method: " + (end - start));

        System.out.println("\n\n");
        IntStream.range(1, 10).forEach(t -> System.out.println("Thread is " + Thread.currentThread().getName() + ": " + t));

        System.out.println("\n\n");
        IntStream.range(1, 10).parallel().forEach(t -> System.out.println("Thread is " + Thread.currentThread().getName() + ": " + t));

    }
}
