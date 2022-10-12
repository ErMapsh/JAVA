package _15AdvancedJava._5DateTime;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class _4GregorianCalendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());

        System.out.println(Calendar.DATE);
        System.out.println("Date is " + c.get(Calendar.DATE));
        System.out.println("Month is " + c.get(Calendar.MONTH));
        System.out.println("Year is " + c.get(Calendar.YEAR));
        System.out.println("Hour is " + c.get(Calendar.HOUR));
        System.out.println("Minute is " + c.get(Calendar.MINUTE));
        System.out.println("Second  is " + c.get(Calendar.SECOND));
        System.out.println("HOUR of the day is " + c.get(Calendar.HOUR_OF_DAY));

        System.out.println("Railway date format: " + c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));


        //https:docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/GregorianCalendar.html
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println("2000 is Leap year: " + gc.isLeapYear(2000));
        System.out.println("2019 is Leap year: " + gc.isLeapYear(2019));
        System.out.println("Number of weeks: " + gc.getWeeksInWeekYear());

        // Timezone:
        //https://docs.oracle.com/en/java/javase/18/docs/api/java.base/java/util/TimeZone.html
        for (int i = 0; i < TimeZone.getAvailableIDs().length; i++) {
            System.out.println(TimeZone.getAvailableIDs()[i]);
        }
    }
}
