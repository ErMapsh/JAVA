package _17Annotation;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@FunctionalInterface // A functional interface is an interface that contains only one abstract method.
interface myFunctionalInterface {
    void thisMethod();
    // void thisMethod1();
}

class Phone {
    LocalDateTime date = LocalDateTime.now();

    public void showTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("k:m:s a");
        System.out.println(date.format(formatter));
    }

    @Deprecated // sometimes some function are being Deprecated
    public int add(int x, int y) {
        return x + y;
    }
}

class NewPhone extends Phone {
    @Override // when we override the method of base class, that time we use @Override Annotation
    public void showTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd \nk:m:s a");
        System.out.println(date.format(formatter));
    }
}

public class _1ExampleClass {
    @SuppressWarnings(value = "deprecation") // if we still want deprecated method that thme we can use this annotation
    public static void main(String[] args) {
        NewPhone np = new NewPhone();
        np.showTime();
        np.add(1, 2); // this method is deprecated but still we can use, with the help of  @suppressWarnings
    }
}
