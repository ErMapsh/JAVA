package _21Java8Features._3ForeachAndFilterMethod._3Example;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {
    public List<Employee> GetUserAreThatEligiable(String input){
        List <Employee> list = new DataBaseLayer().GetEmployee();
        // if(input.equalsIgnoreCase("tax")){
        //     return list.stream().filter(t->t.getSalary()>5000).collect(Collectors.toList());
        // }else{
        //     return list.stream().filter(t->t.getSalary()<5000).collect(Collectors.toList());
        // }
        return (input.equalsIgnoreCase("tax"))? list.stream().filter(t->t.getSalary()>5000).collect(Collectors.toList()):
        list.stream().filter(t->t.getSalary()<5000).collect(Collectors.toList());

    }

    public static void main(String[] args) {
        System.out.println(new TaxService().GetUserAreThatEligiable("tax"));
        System.out.println(new TaxService().GetUserAreThatEligiable("non tax"));
    }
}
