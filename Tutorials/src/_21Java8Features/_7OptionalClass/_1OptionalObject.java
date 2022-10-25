package _21Java8Features._7OptionalClass;

import java.util.Arrays;
import java.util.Optional;

//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html

public class _1OptionalObject {
    public static void main(String[] args) {
        customer cust = new customer(1, "ErMapsh", null, Arrays.asList("454545", "4545454"));

        Optional<Object> empty = Optional.empty();
        System.out.println("using empty: " + empty);

        try {
            Optional<Object> emailOptional = Optional.of(cust.getEmail());//if i give null object to of(), then null pointer exception occur.
            //Optional<Object> emailOptional = Optional.of(customer.getId());
            System.out.println("using of: " + emailOptional);
        } catch (NullPointerException e) {
            System.out.println("Null pointer is provided\t"+ e);
        }

        Optional<Object> email = Optional.ofNullable(cust.getEmail());// ofNullable is not throwing error even we pass a null object
        System.out.println("using ofNullable: " + email);
    }
}
