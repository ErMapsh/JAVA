package _7MethodInJava;

public class _2MethodOverloading {
    public static void main(String[] args) {
        System.out.println("----Method Overloading----");

        // function is method is type of method     overloading
        function();
        function(3);
        function("Mahesh", "Mestri");

    }

    private static void function() {
        System.out.println("with no argument");
    }

    private static void function(int x) {
        System.out.printf("with %d parameter\n", x);
    }

    private static void function(String fname, String Lname) {
        System.out.printf("Full name is %s %s\n", fname, Lname);
    }

    // method overloading is cannot perform by changing return type, if we do like below function we will get error as we already
    // have same type of function

    /*

    private static int function(String fname, String Lname){
        return 0
    }
    */
}
