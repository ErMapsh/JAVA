package practice._15AdvancedJava;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class _4Date {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();

        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s");

        String myDate = date.format(df);
        System.out.println(myDate);

    }
}
