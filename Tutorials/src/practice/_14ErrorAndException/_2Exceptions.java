package practice._14ErrorAndException;

public class _2Exceptions {
    public static void Arith(int a, int b) {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("HAHA");
        }
    }

    public static void IllegalArg(int a, int b) {
        /*
        IllegalArgumentException is a Java exception indicating that a method has received an argument that is invalid or inappropriate for this method's purposes.
        */
        try {
            if (a == 0 | b == 0) {
                throw new IllegalArgumentException("HEHE");
            }
            System.out.println(a * b);
        } finally {
            System.out.println("Finally of Illegal Argument Exception");
        }
    }

    public static void main(String[] args) {
        /* 2.Write a java program that prints "HAHA" during arithmetic exception and "HEHE" during an Illegal argument exception */
        Arith(4, 0);

        IllegalArg(4, 0);

    }
}
