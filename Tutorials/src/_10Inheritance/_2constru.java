package _10Inheritance;

class base1 {
    private int a;

    base1() {
        System.out.println("base1 constructer-->");
    }

    base1(int a) {
        this.a = a;
        System.out.println("constructer with value a is ");
    }

    base1(int a, int b){
        System.out.printf("I m third constructer with a and b is %d, %d\n", a, b);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}

class Derived1 extends base1 {
    private int y;

    Derived1() {
        // but i want to call another base constructer then we will do like this
        super(5, 1); // its find the overriding constructer through passing argument
        System.out.println("Derived Class with base constructer");
    }

    Derived1(int y) {
        super();// if there are not constructer like these then it will throw error 
        this.y = y;
        System.out.println("Derived1 with 1 parameter "+ y);
    }

}

class ChildOfDerived extends Derived1{

    private String name;

    ChildOfDerived(){
        super(3); // it will called the constucter that have one argument
        System.out.println("I m super child ");
    }
    ChildOfDerived(String name){
        this.name = name;
    }

}

public class _2constru {
    public static void main(String[] args) {
        
        base1 b1 = new base1();

        System.out.println("\n");

        Derived1 d1 = new Derived1(3);

        // Note: when u call the derived constructer then must called base constructer

        /*
         This is derived constructer, but if this not created in derived class, then  class object  automatically called base class constructer
        */
        /* if derived constructer is exist in then derived constructer first called base constructer and after called itself */
        
        System.out.println("\n");

        ChildOfDerived COD = new ChildOfDerived();
    }
}
