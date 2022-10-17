package _18LamdaExpression;

@FunctionalInterface
interface ermapshFunction {
    void method1(int a);
}

// here is a classical way to implement a class using interface
/*
class A implements ermapshFunction {

    @Override
    public void method1() {
        System.out.println("Method1");
    }

    @Override
    public void method2() {
        System.out.println("Method2");
    }
}
 */

public class LambdaExperssion {
    public static void main(String[] args) {

        // lambda function ---. anonymous function
        /*
        we can lambda function when functional interface have one method
         */

        ermapshFunction obj = (a) -> {
            System.out.println("I am method 1 from this lambda method" + a);
        };

        obj.method1(5);

    }
}
