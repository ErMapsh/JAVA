package _21Java8Features._3ForeachAndFilterMethod._3Example;

import java.util.ArrayList;
import java.util.List;

public class DataBaseLayer {
    public List<Employee>  GetEmployee(){
        List <Employee> list = new ArrayList<>();
        list.add(new Employee(173, "Mahesh", "Security", 5900));
        list.add(new Employee(176, "ErMapsh", "Cyber", 4000));
        list.add(new Employee(179, "Mahi", "Network", 51444));
        return list;
    }

    public static void main(String[] args) {
        System.out.println(new DataBaseLayer().GetEmployee());
    }
}
