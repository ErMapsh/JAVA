package _15AdvancedJava._5DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class _6DateTimeFormatter {
    public static void main(String[] args) {
        //https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/time/LocalDateTime.html
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        // DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
        String MyDate = dt.format(formatter);
        System.out.println(formatter + "        Date is : " + MyDate);

        // DateTimeFormatter with Predefined Formatters
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd MM yyyy --E --k:m:s a");
        System.out.println(dt.format(formatter1));

        DateTimeFormatter dt2 = DateTimeFormatter.ISO_LOCAL_TIME;
        System.out.println(dt.format(dt2));

    }
}
