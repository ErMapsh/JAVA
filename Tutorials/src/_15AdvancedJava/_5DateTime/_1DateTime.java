package _15AdvancedJava._5DateTime;

public class _1DateTime {
    public static void main(String[] args) {
        /*
         * How its working
         * actually for calculation in computer having rules.
         * here for dividation left to right associativity works
         * 
         * seconds = System.currentTimeMillis()/1000ms;
         * minutes = seconds/60sec;
         * hours = minutes/3600se;
         * day = hours/24hrs;
         * years = day/365 days
         * decades = years/10
         * 
         */
        System.out.println("MS is " + System.currentTimeMillis());
        System.out.println("MS is in second: " + System.currentTimeMillis() / 1000);
        System.out.println("MS is in Minutes: " + System.currentTimeMillis() / 1000 / 60);
        System.out.println("MS is in Hours: " + System.currentTimeMillis() / 1000 / 3600);
        System.out.println("MS is in Day: " + System.currentTimeMillis() / 1000 / 3600 / 24);
        System.out.println("MS is in Year: " + System.currentTimeMillis() / 1000 / 3600 / 24 / 365);
        System.out.println("MS is in Decade: " + System.currentTimeMillis() / 1000 / 3600 / 24 / 365 / 10);
    }
}
