package _7MethodInJava;

public class _3VarArgs {
    public static void main(String[] args) {
        System.out.println("----VarArgs----");

        fun(1, 3, 5);

        newfun(1, 2, 3, 4, 5, 6);
        newfun(1, 2, 3, 4, 5, 6, 7, 8);
        newfun();
    }

    private static void newfun(int... nums) {
        int[] arr = nums; // its like that

        int sum = 0;
        for (int e : nums) {
            sum += e;
        }
        System.out.println("sum is " + sum);
    }


    // its like arbitrary arguments in python
    private static void fun(int... a) {
        /* Here int... is like int[] */
        System.out.println("The type of a is " + a.getClass().getSimpleName());
        for (int e : a
        ) {
            System.out.printf("%d ", e);
        }
        System.out.println();
    }
}
