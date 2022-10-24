package _21Java8Features._6MapAndFlatMap.Example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataBaseLayer {
    public List<Customer> getAllCust() {
        {
            return Stream.of(
                    new Customer(101, "john", "johntwist073@gmail.com", Arrays.asList("3343422", "345555")),
                    new Customer(101, "john", "johntwist073@gmail.com", Arrays.asList("3343422", "345555")),
                    new Customer(101, "john", "johntwist073@gmail.com", Arrays.asList("3343422", "345555")),
                    new Customer(101, "john", "johntwist073@gmail.com", Arrays.asList("3343422", "345555"))
            ).collect(Collectors.toList());
        }
    }
}