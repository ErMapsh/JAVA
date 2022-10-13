package practice._15AdvancedJava;

import java.util.Calendar;

public class _3Date {
    public static void main(String[] args) {
        // using Calendar class
        Calendar c = Calendar.getInstance();
        System.out.println("H:M:S is " + c.get(Calendar.HOUR_OF_DAY) + ":"
                + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
    }
}
