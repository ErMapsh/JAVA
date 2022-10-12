package _15AdvancedJava._5DateTime;

import java.util.Calendar;

public class _3CalenderClass {
    public static void main(String[] args) {
        // https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/Calendar.html


        Calendar c = Calendar.getInstance();// calendar class is abstract class
        System.out.println(c.getCalendarType());// type of calendar
        System.out.println(c.getTimeZone()); // timezone

        Calendar newC = Calendar.getInstance();
        System.out.println(newC.getCalendarType());
        System.out.println(newC.getTimeZone());
        System.out.println(newC.getTimeZone().getID());
        System.out.println(newC.getTimeInMillis());
    }
}
