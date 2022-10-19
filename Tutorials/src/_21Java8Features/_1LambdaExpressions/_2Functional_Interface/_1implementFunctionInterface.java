package _21Java8Features._1LambdaExpressions._2Functional_Interface;

class FunctionalInterfaceDemo implements Runnable {
    @Override
    public void run() {
        System.out.println("This is my own class method");
    }

}

public class _1implementFunctionInterface {
    public static void main(String[] args) {
        FunctionalInterfaceDemo FID = new FunctionalInterfaceDemo();
        FID.run();
    }
}
