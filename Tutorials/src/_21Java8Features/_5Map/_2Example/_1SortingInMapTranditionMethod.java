package _21Java8Features._5Map._2Example;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;

class myComp implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
      return  0;
    };
}

public class _1SortingInMapTranditionMethod {
    public static void main(String[] args) {
        Map<Employee, Integer> emp = new DatabaseLayer().getAllEmployee();
        // emp.forEach((k, v )-> System.out.println(k+" :"+v));
        System.out.println(emp);
        System.out.println(emp.entrySet());
        }
}
