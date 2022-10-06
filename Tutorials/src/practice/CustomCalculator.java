package practice;

import java.util.InputMismatchException;
import java.util.Scanner;

class MaxLimit extends Exception {
    MaxLimit(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class SevenKInput extends Exception {
    SevenKInput(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class MyCustomCalculator {
    Scanner sc = new Scanner(System.in);
    private int a, b;

    public void setAB() {
        try {
            System.out.print("Enter a: ");
            int c = sc.nextInt();
            if (c > 100000) {
                throw new MaxLimit("input A should not be greater than 100000");
            }
            this.a = c;

            System.out.print("Enter b: ");
            int d = sc.nextInt();
            if (d > 100000) {
                throw new MaxLimit("input B should not be greater than 100000");
            }
            this.b = d;

            System.out.println();
        } catch (InputMismatchException e) {
            System.out.println("Enter the correct Input..., You need to restart the program");
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public void Add() {
        try {
            System.out.println(this.a + this.b);
            System.out.println();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void Sub() {
        try {
            System.out.println(this.a - this.b);
            System.out.println();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void Mul() {
        try {
            if (this.a > 7000) {
                throw new SevenKInput("Input A should not be greater than 7000");
            } else if (this.b > 7000) {
                throw new SevenKInput("Input B should not be greater than 7000");
            }
            System.out.println(this.a * this.b);
            System.out.println();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void Div() {
        try {
            if (this.b == 0) {
                throw new ArithmeticException("Cannot divide by 0 Exception\n");
            }
            System.out.println(this.a / this.b);
            System.out.println();
        } catch (Exception e) {
            System.out.println(e);
        }
    }


}

public class CustomCalculator {
    public static void main(String[] args) {
        /*
        Exercise 6: You have to create a custom calculator with following operations:
        1. + -> Addition
        2. - -> Subtraction
        3. * -> Multiplication
        4. / -> Division
        which throws the following exceptions:
        1. Invalid input Exception ex: 8 & 9
        2. Cannot divide by 0 Exception
        3. Max Input Exception if any of the inputs is greater than 100000
        4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
         */

        MyCustomCalculator mcc = new MyCustomCalculator();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.set a and b \n2.Addition \n3.Subtraction \n4.Multiplication \n5.divide \n6.Exit\n");
            System.out.print("Enter Your Choice: ");

            try {

                int a = sc.nextInt();
                switch (a) {
                    case 1:
                        mcc.setAB();
                        break;
                    case 2:
                        mcc.Add();
                        break;
                    case 3:
                        mcc.Sub();
                        break;
                    case 4:
                        mcc.Mul();
                        break;

                    case 5:
                        mcc.Div();
                        break;
                    case 6:
                        System.out.println("Exit");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Enter Correct Choice");

                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
