package _10Inheritance;

class EkClass{
    int a;

    EkClass(){}

    EkClass(int a){
        this.a = a;
    }

    public int ReturnOne(){
        return 1;
    }

    public void setAandGetA(int a) {
        /* sometimes our argument and attributes names are begin same, that time we can use this keyword to show this is attribute/method of class */ 
        this.a = a;
        System.out.println("return value is "+ this.ReturnOne() + " & value of a is "+ this.a);
    }
}

class DerivedClass extends EkClass{

    private int x;

    DerivedClass(){}

    DerivedClass(int a){
        super(a);
        this.x = a+4;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

}

public class _3ThisAndSuper {
    public static void main(String[] args) {
        /* this --> this is reference keyword */
        EkClass _1class = new EkClass();
        _1class.setAandGetA(5);


        /* super ---> reference variable used to refer immediate parent class object (attributes/methods/constructer) */ 

        // used to call the contructer of the parent class   
        DerivedClass der = new DerivedClass(100);
        der.setAandGetA(50);

    }
}
