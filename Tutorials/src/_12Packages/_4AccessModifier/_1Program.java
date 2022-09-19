

class anotherClass{
    /* access modifier is way to give permission to attribute/methods :

        there are 
     * 1.public
     * 2.protected  
     * 3.default(no modifier)
     * 4.private
    */

    public int a = 4; // accessiable to anywhere and also inheritable
    protected float b = 45.4f;// inheritable but not accessiable directly
    String name = "Programmer";
    private String Thing = "Unknown"; // not inheritable and not accessiable

    public void meth1(){
        System.out.println("Inheritable and accessiable directly in class, subclass, package, world");
    }

    protected void meth2(){
        System.out.println("inheritable in anothere class, but not accessible directly. but we can access through another public method");
    }

    private void meth3(){
        System.out.println("Not inheritable and not accsiable directly but we can access through another public method");
    }

    void meth4(){
        System.out.println("Default access modifier.... only access in ");
    }
}


public class _1Program {
    public static void main(String[] args) {
        System.out.println("----access modifier----");  

        /*
        modifier    class    package   subclass   world

        public        Y         Y          Y        Y
        protected     Y         Y          Y        N
        default       Y         Y          N        N
        private       Y         N          N        N


        class ---> public, protected, default, private thing can access
        package ---> public, protected, default thing can access
        subclass ----> public, protected thing can access
        world ---> public thing can access
        */
    }
}
