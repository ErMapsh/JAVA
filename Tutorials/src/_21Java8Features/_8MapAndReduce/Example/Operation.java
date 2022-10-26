package _21Java8Features._8MapAndReduce.Example;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class Operation {
    public static void main(String[] args) {
        List<Employee> emp = Database.getEmp();
        System.out.println(emp);

        // get employee whose Dept A, and fetch the salary
        OptionalDouble avgSalary = emp.stream().filter(employe -> employe.getDept().equalsIgnoreCase("A")).
                map(e -> e.getSalary()).mapToInt(Math::toIntExact).average();

        int sumSalary = emp.stream().filter(employe -> employe.getDept().equalsIgnoreCase("A")).
                map(e -> e.getSalary()).mapToInt(Math::toIntExact).sum();

        System.out.println(avgSalary.getAsDouble());
        System.out.println(sumSalary);
    }
}
