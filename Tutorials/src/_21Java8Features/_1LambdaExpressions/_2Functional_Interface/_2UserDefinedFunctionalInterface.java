package _21Java8Features._1LambdaExpressions._2Functional_Interface;

@FunctionalInterface
interface myFunctionalInterface {
    void m1();
    /* Functional interface that contain only one abstract method but can multiple default and static methods*/

    default String m2() {
        return "Returns Default method2 string";
    }

    default String m3() {
        return "Returns Default method3 string";
    }
}

public class _2UserDefinedFunctionalInterface {
    public static void main(String[] args) {

    }
}
