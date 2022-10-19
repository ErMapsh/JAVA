package _21Java8Features._1LambdaExpressions;

@FunctionalInterface
interface MyFI {
    void m1();
    /* Functional interface that contain only one abstract method but can multiple default and static methods*/

}

class myClass implements MyFI {
    @Override
    public void m1() {
        System.out.println("my m1 method");
    }
}

public class _1LambdaExpression {
    public static void main(String[] args) {
        /*
            Lambda expression only work with functional interface
            Syntax for lambda expression
            ()          ->            {body}
         */

        //Note: We don't need to create class for implement Functional Interface, we can also do that using Lambda expression

        MyFI obj = () -> {
            System.out.println("My new m1 method body here");
        };

        obj.m1();

    }
}
