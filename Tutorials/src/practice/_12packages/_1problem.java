package practice._12packages;

import java.lang.Math;

class calculater {
    public void calculate(int a, int b) {
        System.out.println("Your result is " + (a + b));
    }
}

class ScientificCalculater {
    public void calculate(int a, int b) {
        System.out.println("Your result is " + Math.sin(a + b));
    }
}

class Hybridcalculater {
    public void calculate(int a, int b) {
        System.out.println("Your result is " + (a + b));
        System.out.println("Your result is " + Math.sin(a + b));
    }
}

public class _1problem {
    public static void main(String[] args) {

    }
}
