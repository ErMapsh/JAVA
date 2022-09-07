package _8OOPS;
class square{
    int side;
    public int perimeter(int a){
        System.out.println(a*4);
        return a*4;
    }

    public int area(int a){
        System.out.println(a*a);
        return a*a;
    }
}

public class _3square {
    public static void main(String[] args) {
        square squ = new square();
        squ.perimeter(5);
        squ.area(5);
    }
}
