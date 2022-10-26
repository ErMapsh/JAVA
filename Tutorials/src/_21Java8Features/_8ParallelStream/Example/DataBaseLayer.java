package _21Java8Features._8ParallelStream.Example;

import _21Java8Features._8ParallelStream.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataBaseLayer {
    public List<Employee> getAllEmp() {
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            employees.add(new Employee(i, "employee" + 1, 'A', (double) new Random().nextInt(1000 * 100)));
        }
        return employees;
    }
}
