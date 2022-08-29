package com._7DataType;

public class IncreamentAndDecreament {
    public static void main(String[] args) {
        System.out.println("--------Increment Operator------");
        // is also called post increment and pre increment
        int a = 5;
        System.out.println(++a);// first increment after print
        System.out.println(a);
        System.out.println(a++);// first print after do increment
        System.out.println(a);

        System.out.println();

        // is also called post decrement and pre decrement
        int b = 10;
        System.out.println(--b);// first decrement after print
        System.out.println(b);
        System.out.println(b--);// first print after do decrement
        System.out.println(b);

        int c =7;
        int x = ++c + 45 ;
        System.out.println("\nx is "+ x);
    }
}
