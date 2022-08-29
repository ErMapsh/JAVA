package com._7DataType;

public class DataType {
    public static void main(String[] args) {
        System.out.println("----- Data Type of Expressions & Increment/Decrement Operators -----");
        int a = 1;
        short b = 6;
        byte c = 8;

        int d = c + b; //short and byte become int
        System.out.println(d);

    }
}

/*
 short + byte = int;
 short + int  = int;
 long + float = float;
 int +  float = float;
 char + int   = int;
 char + short = int;
 long + double = double;
 float + double = double;
*/
