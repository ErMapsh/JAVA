package _21Java8Features._5Map._2Example;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class _2SortingMapWithLambada {


    public static void main(String[] args) {
        // with traditional method
        Map<Employee, Integer> map = new TreeMap<>((o1 , o2) -> (int) (o1.getSalary() - o2.getSalary()));
        map.put(new Employee(2, "Mahesh Mestri", "Security", 45000), 23);
        map.put(new Employee(3, "ermapsh", "Cyber", 30000), 21);
        map.put(new Employee(4, "mapsh", "Networking", 20000), 25);
        map.put(new Employee(5, "learnermapsh", "leaner", 60000), 20);
        System.out.println(map + "\n");

        Map<Employee, Integer> map1 = new TreeMap<>((o1 , o2) -> (int) (o1.getSalary() + o2.getSalary()));
        map1.put(new Employee(12, "Mahesh Mestri", "Security", 45000), 23);
        map1.put(new Employee(13, "ermapsh", "Cyber", 30000), 21);
        map1.put(new Employee(14, "mapsh", "Networking", 20000), 25);
        map1.put(new Employee(15, "learnermapsh", "leaner", 60000), 20);
        System.out.println(map1 + "\n");

        // with new method
        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary))).forEach(System.out::println);
        System.out.println();
        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed())   ).forEach(System.out::println);


        // we can also sort a item based on values
    }
}
