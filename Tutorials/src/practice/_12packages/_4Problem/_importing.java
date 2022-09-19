package practice._12packages._4Problem;

class extendclass extends _4class{
    public void display(){
        System.out.println(a);
        System.out.println(b);
        // System.out.println(c);// we cannot access private
    }
}

public class _importing {
    public static void main(String[] args) {
        extendclass ec = new extendclass();
        ec.display();
    }
}
