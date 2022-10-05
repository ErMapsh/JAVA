package _14ErrorAndException;

class NegRadiExcp extends Exception {
    @Override
    public String toString() {
        return "Radius cannot be Negative";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be Negative";
    }
}

public class _6ThrowVsThrows {
    public static void main(String[] args) {
        System.out.println("--------Throw and Throws-------\n");
        // ermapsh - uses divide function create by harry
        try {
//            int c = divide(4, 0);
//            System.out.println(c);
            double d = areaOfCircle(-2);
            System.out.println(d);
        } catch (Exception e) {
            System.out.println("Exception:" + e);
        }

    }

    // created by harry
    public static int divide(int a, int b) throws ArithmeticException {
        // here is one exception can be arrived that is arithmetic
        return a / b;
    }

    public static double areaOfCircle(int r) throws NegRadiExcp {
        // is there a chance, radius can be in -ve, so that times we don't want that -ve area
        if (r < 0) {
            throw new NegRadiExcp();
        }
        return Math.PI * r * r;
    }

}
