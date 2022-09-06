package _7MethodInJava;

public class _4Recursion {
    public static void main(String[] args) {
        System.out.println("----Recursion----");
        // factorial(5) = 5 * 4 * 3 * 2 * 1;


        int x = 5; //actual parameter
        System.out.printf("value of fact(5) is %d\n", factorial(x));

        System.out.printf("Value of fact(5) by iteration is %d", factInt(x));
    }

    private static int factInt(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // We can also do this using iteration methods
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            return fact;
        }
    }

    private static int factorial(int i) {
        if (i == 1 || i == 0) {
            return 1;
        } else {
            return i * factorial(i - 1);
        }
    }

}
