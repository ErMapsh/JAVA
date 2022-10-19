package _21Java8Features._1LambdaExpressions;

@FunctionalInterface
interface Calc {
    //int add(int x, int y);
    //int sub(int x, int y);
    int mul(int x, int y);
}

public class _2LambdaExp {
    public static void main(String[] args) {
        /*
        Calc obj = (x, y) -> {
            int c = x + y;
            return c;
        };
         */

        /*
        Calc obj = (x, y) -> {
            int c = x - y;
            return c;
        };
         */

        Calc obj = (x, y) -> {
            if (x == 0 || y == 0) {
                throw new ArithmeticException("one of the element is 0 or both");
            } else {
                return x * y;
            }
        };

        System.out.println(obj.mul(0, 3));
    }
}
