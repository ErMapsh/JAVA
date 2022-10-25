package _21Java8Features._7OptionalClass;

import _21Java8Features._6MapAndFlatMap.Example.Customer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataBaseLayer2 {
    public List<customer> getAllCust() {
        {
            return Stream.of(
                    new customer(101, "john", "johntwist073@gmail.com", Arrays.asList("3343422", "345555")),
                    new customer(101, "ermapsh", "ermapsh@gmail.com", Arrays.asList("3343422", "345555")),
                    new customer(101, "delhi", "delhi@gmail.com", Arrays.asList("3343422", "345555")),
                    new customer(101, "john", "johntwist073@gmail.com", Arrays.asList("3343422", "345555"))
            ).collect(Collectors.toList());
        }
    }
}