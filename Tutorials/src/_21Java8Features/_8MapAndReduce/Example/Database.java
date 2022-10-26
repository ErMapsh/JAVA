package _21Java8Features._8MapAndReduce.Example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Database {
    public static List<Employee> getEmp(){
        return Stream.of(
            new Employee(1, "ermapsh", "A", 3434),
            new Employee(2, "john", "B", 222),
            new Employee(3, "mapsh", "A", 4545),
            new Employee(4, "mahesh", "D", 5665)
        ).collect(Collectors.toList());

    }
}
