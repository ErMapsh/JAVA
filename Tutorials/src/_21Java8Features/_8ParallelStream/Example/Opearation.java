package _21Java8Features._8ParallelStream.Example;

import java.util.List;

public class Opearation {
    public static void main(String[] args) {
        List<Employee> emp = new DataBaseLayer().getAllEmp();
        //System.out.println(emp);
        long start = 0, end = 0;

        // sequential
        System.out.println("---------with Sequential---------");
        start = System.currentTimeMillis();
        double asDouble = emp.stream().map(t->t.getSalary()).mapToDouble(i -> i).average().getAsDouble();
        end = System.currentTimeMillis();
        System.out.println(asDouble+ " Within "+  (end-start));

        System.out.println("---------with Parallel---------");
        // parallel
        start = System.currentTimeMillis();
        double newDouble = emp.parallelStream().map(i -> i.getSalary()).mapToDouble(i->i).average().getAsDouble();
        end = System.currentTimeMillis();
        System.out.println(asDouble+ " Within "+  (end-start));

    }
}
