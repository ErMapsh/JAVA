package _21Java8Features._5Map._2Example;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class DatabaseLayer {
    public Map<Employee, Integer> getAllEmployee(){
        Map <Employee, Integer> map = new TreeMap<>(new Comparator<Employee>(){

            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getSalary() - o2.getSalary());
            }
        });

        map.put(new Employee(2, "Mahesh Mestri", "Security", 45000), 23);
        map.put(new Employee(2, "ermapsh", "Cyber", 30000), 21);
        map.put(new Employee(2, "mapsh", "Networking", 20000), 25);
        map.put(new Employee(2, "learnermapsh", "leaner", 60000), 20);
        return map;
    }
}
