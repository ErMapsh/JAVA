package _21Java8Features._7OptionalClass;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Optional.html

public class _2AccessingOptionalObject {
    public static customer getCustomerByEmailId(String email) throws Exception {
        List <customer> all =  new DataBaseLayer2().getAllCust();
        return all.stream().filter(t-> t.getEmail().equals(email)).findAny().orElseThrow(()->new Exception("no customer present with this email id"));
    }

    public static customer getCustomerByEmailId1(Optional<String> email) throws Exception {
        List <customer> all =  new DataBaseLayer2().getAllCust();
        return all.stream().filter(t-> t.getEmail1().equals(email)).findAny().orElseThrow(()->new Exception("no customer present with this email id"));
    }

    public static void main(String[] args) throws Exception {
        customer customer = new customer(1, "ErMapsh", null, Arrays.asList("454545", "4545454"));

        Optional<Object> phones = Optional.ofNullable(customer.getPhoneNumber());
        System.out.println(phones.isPresent()); // return true or false
        System.out.println(phones.orElse(null));
        System.out.println(phones.hashCode());
        System.out.println(phones.isPresent());
        System.out.println(phones.isEmpty());
        System.out.println(phones.stream());
        System.out.println(phones.toString());

        Optional <Object> email = Optional.ofNullable(customer.getEmail());
        System.out.println(email.orElse("Defalt@gmail.com"));
        try {
        System.out.println(email.orElseThrow(()-> new IllegalArgumentException("Email not present")));
        }catch (IllegalArgumentException e){
            System.out.println(e);
        }


        Optional <Object> name = Optional.ofNullable(customer.getName());
        System.out.println(name.get());


        //System.out.println(getCustomerByEmailId("hrr"));
        System.out.println(getCustomerByEmailId1(Optional.ofNullable("ermapsh@gmail.com")));// recommend way to use optional in customer class





    }
}
