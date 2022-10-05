package _14ErrorAndException;

import java.util.Scanner;

class MyException extends Exception {
    @Override
    public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}


class IsGreater extends Exception {
    @Override
    public String toString() {
        return "Yes, you are older";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

public class _5ExceptionClass {
    public static void main(String[] args) {
        /*
          Exception class has the following imp methods:
          1. String toString() --> executed when sout(e) is run
          2. void printStackTrace() ----> print stack trace
          3. String getMessage() -----> print the Exception message
         */

        Scanner sc = new Scanner(System.in);

        // built in exception
        try {
            int divider = 0;
            if (divider == 0) {
                throw new ArithmeticException("divider should be not 0");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        // first custom exception
        System.out.print("Enter the number 1: ");
        int a = sc.nextInt();
        try {
            if (a < 18) {
                throw new MyException();
            }

        } catch (Exception e) {
            System.out.println("string: " + e);
            System.out.println("message: " + e.getMessage());
            //e.printStackTrace(); // not actual error but its give error with line number
            System.out.println("Finished");
        }


        //  another custom Exception
        System.out.print("Enter the number 2: ");
        int b = sc.nextInt();
        try {
            if (b < 18) {
                throw new IsGreater();
            }
        } catch (Exception e) {
            System.out.println("string: " + e);
            System.out.println("message: " + e.getMessage());
            e.printStackTrace(); // its give error with line number
            System.out.println("Finished");
        }

    }
}
