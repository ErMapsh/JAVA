package _10Inheritance;

// java dosent support multiple inheritance

/*
    parent ----> phone
    child ----> SmartPhone
*/


/*
    BASE CLASS PUBLIC ATTRIBUTE/METHODS BECOME INHERITED AS TO PUBLIC 
    methods/attributes of derived class;
    
    for public derived class

    att/methos  inheritable or what?
    public ---> inheritable as public methods/attri
    private ---> not inheritable in any class
    protected ---> inheritable but become private methods/attri
*/

class base {
    int a;

    public int getA() {
        return a;
    }

    protected void setA(int a) {
        this.a = a;
    }
}

class Derived extends base {
    // access modifier specifies which methods/attributes where should be visible
    // public all methods and attributes of class base are begin public
    // methods/attributes of class Derived

    int DerivedValue;// public attribute of class Derived

    public int getDerivedValue() {
        return DerivedValue;
    }

    public void setDerivedValue(int derivedValue) {
        DerivedValue = derivedValue;
    }
}

public class _1inheri {
    public static void main(String[] args) {
        System.out.println("----Inheritance----");

        base bas = new base();
        bas.setA(59);
        System.out.println(bas.getA());


        Derived der = new Derived();
        der.setA(5); // WE SETTING THE VALUE OF BASE CLASS THROUGH DERIVED CLASS
        System.out.println(der.getA());
    }
}
