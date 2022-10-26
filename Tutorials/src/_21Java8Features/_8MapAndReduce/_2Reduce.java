package _21Java8Features._8MapAndReduce;

import java.util.Arrays;
import java.util.List;

public class _2Reduce {
    public static void main(String[] args) {
        List<String> ls = Arrays.asList("corejava", "spring", "hibernate");
        String val = ls.stream().reduce((word1, word2)->word1.length() > word2.length() ? word1: word2).get();
        System.out.println(val);
    }
}
