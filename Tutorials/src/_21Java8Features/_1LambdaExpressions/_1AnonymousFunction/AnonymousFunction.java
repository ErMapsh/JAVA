package _21Java8Features._1LambdaExpressions._1AnonymousFunction;

public class AnonymousFunction {
    public static void main(String[] args) {
        new AnonymousFunction().add(1, 3);
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    /* the anonymous function, that don't have any name, accessor specifier, return type */
    /*
    (){
        System.out.println("This is anonymous function");
    }
    */
}
