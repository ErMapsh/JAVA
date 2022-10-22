package _21Java8Features._4Sort_a_List._3Example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyAscendingComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.getSalary()-o2.getSalary());
    }

}class MyDecendingComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.getSalary()+o2.getSalary());
    }
}

public class _1SortAList {
    List <Employee> emp = new DataBaseLayer().GetEmployee();

    public static void main(String[] args) {
        /*
            when such time we have to sort a list using object that time we collections api
        */
        List <Employee> emp = new DataBaseLayer().GetEmployee();
        //emp.stream().forEach(t-> System.out.println(t));

        // Using Collections
        Collections.sort(emp, new MyDecendingComparator());
        System.out.println(emp);
        Collections.sort(emp, (Employee o1, Employee o2) -> (int) (o1.getSalary()-o2.getSalary()));

        // Using List
        emp.sort(new MyDecendingComparator());

    }
}
