package _10Inheritance;

class A {
    int a;

    public int meth1() {
        return 1;
    }

    public void meth2() {
        System.out.println("Method2 from class A");
    }
}

class B extends A {

    @Override // keyword to say this method is overrided
    public void meth2() {
        System.out.println("Meth2 from class B");
    }

    public int meth3() {
        return 2;
    }
}

public class _4MethodOverriding {
    public static void main(String[] args) {
        B b = new B();
        b.meth2();// in class B already meth2 is present
    }
}
