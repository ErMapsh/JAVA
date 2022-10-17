package _18JavaAnonymousClasses;

//https://docs.oracle.com/javase/tutorial/java/javaOO/anonymousclasses.html

interface MoreMethods {
    void method1();

    void method2();
}

//class Second implements MoreMethods {
//
//    @Override
//    public void method1() {
//        System.out.println("Method1");
//    }
//
//    @Override
//    public void method2() {
//        System.out.println("Method2");
//    }
//}

public class AnonymousClass {
    public static void main(String[] args) {
        /*
        anonymous Class things - we don't need to make a class for small thing like Second
        class, we implement a methods from interface and implement a class in main method
         */

        MoreMethods mm = new MoreMethods() {
            @Override
            public void method1() {
                System.out.println("Method1");
            }

            @Override
            public void method2() {
                System.out.println("Method2");
            }
        };

        // see we can also implement and run interface method in main method
        mm.method1();
        mm.method2();

    }
}
