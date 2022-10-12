package _15AdvancedJava._5DateTime;

import java.util.Date;

public class _2DataClass {
    public static void main(String[] args) {

        // Integer max range
        System.out.println("Int Max value: " + Integer.MAX_VALUE);

        // storing ms value in Long, is pretty safe to ms value in long
        System.out.println("Long Max value: " + Long.MAX_VALUE);
        System.out.println("Ms is " + System.currentTimeMillis());

        // Date class
        /* https://docs.oracle.com/en/java/javase/18/docs/api/java.sql/java/sql/Date.html */
        Date d = new Date();// full format
        System.out.println(d);

        // constructor
        long l = 166554211524L;
        Date d1 = new Date(l);
        System.out.println(d1);
        System.out.println();

        System.out.printf("1.Date time is in to-string is %s\n", d.toString().substring(0, 20));

        // SetTime
        d.setTime(l);
        System.out.println("2.SetTime using setTime: " + d.toString());
        System.out.println();

        // Deprecated
        d.setHours(14);
        d.setMinutes(59);
        d.setSeconds(45);
        System.out.println("After setting up Hours: " + d.getHours());
        System.out.println("After setting up Min: " + d.getMinutes());
        System.out.println("After setting up Sec: " + d.getSeconds());
    }
}
