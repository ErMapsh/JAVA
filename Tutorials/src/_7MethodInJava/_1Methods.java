package _7MethodInJava;

public class _1Methods {

    public static void main(String[] args) {
        System.out.println("----Methods In Java----");
        /*
            DataType name(){
                //method body
            }
        Note: method can be private, public
              method have return type int, float, string, char, void, pointer


            static keyword
            static method is used to associate a method of a given class with the class rather than the object
        */

        System.out.println(sum(1, 2));
        System.out.println(sub(5, 2));

        // called by class object
        _1Methods obj = new _1Methods();
        obj.display();
    }

    public static void display() {
        System.out.println("This is called by class object");
    }

    public static int sub(int a, int b) {
        // System.out.println(x - y);
        return a - b;
    }

    public static int sum(int x, int y) {
        // System.out.println(x + y);
        return x + y;
    }
}

