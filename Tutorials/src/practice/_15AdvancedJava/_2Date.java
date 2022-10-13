package practice._15AdvancedJava;

import java.util.Date;

public class _2Date {
    public static void main(String[] args) {
        // using date class
        Date d = new Date();
        System.out.println("H:M:S is " + d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());
        System.out.println(d.toString());
    }
}
