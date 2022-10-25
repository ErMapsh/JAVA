package _21Java8Features._6MapAndFlatMap.Example;

import java.util.List;
import java.util.stream.Collectors;

public class Operation {
    public static void main(String[] args) {
        List<Customer> customersList = new DataBaseLayer().getAllCust();
        System.out.println("\n" + customersList);
        //customersList.stream().forEach(System.out::println);

        /* --------------------Mapping --> getting input as collection, array and transform it completely
        one to one mapping
         */
        List<String> email = customersList.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
        System.out.println("\n" + email);

        List <List<String>> phoneNumber = customersList.stream().map(customer -> customer.getPhoneNumber()).collect(Collectors.toList());
        System.out.println(phoneNumber);

        /* -----------------Flatmap
        in above scenario, we gave list of list element, so in that case we can use flatmap.
        one to many mapping
         */
        List<String> phoneNum = customersList.stream().flatMap(customer -> customer.getPhoneNumber().stream()).toList();
        System.out.println("\n"+ phoneNum);

    }
}
