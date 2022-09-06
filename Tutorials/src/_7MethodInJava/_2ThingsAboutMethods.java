package _7MethodInJava;

public class _2ThingsAboutMethods {
    public static void main(String[] args) {
        System.out.println("----Method things----");

        // 1. is possible to change value of var through function --> i think no
        int var = 4;
        change(4);
        System.out.println("Var is changed: " + var);

        // 2. is possible to change array index value through function ----> i think yes
        // cause of we are passing a reference value as argument to function
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        change2(arr);
        System.out.println(arr[0]);// data change
    }

    private static void change2(int[] arr) {
        arr[0] = 0;
    }

    private static void change(int i) {
        i = 2;
    }
}
