package _15AdvancedJava._5DateTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class _5javaTimePackage {
    public static void main(String[] args) {
        //https://docs.oracle.com/javase/8/docs/api/java/time/package-summary.html

        // 1.LocalDate
        LocalDate d = LocalDate.now();
        System.out.println(d);
        System.out.println(d.atStartOfDay());
        System.out.println(d.atTime(12, 45));
        System.out.println(d.atTime(12, 45, 33));
        System.out.println(d.atTime(LocalTime.now()));
        System.out.println(d.getEra()); // “common (or current) era
        System.out.println(d.getMonth());
        System.out.println(d.getMonthValue());
        System.out.println(d.getYear());
        System.out.printf("Current year %d is leap year: %s\n", d.getYear(), d.isLeapYear());
        System.out.println(d.lengthOfMonth());
        System.out.println(d.lengthOfYear());
        System.out.println(d.toString());
    }
}
