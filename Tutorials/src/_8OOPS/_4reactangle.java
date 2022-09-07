package _8OOPS;

class reactangle{
    int l ;
    int w;

    public int area(int l, int w){
        return l*w;
    }
    public int perimeter(int l, int w){
        return 2*(l+w);
    }
}
public class _4reactangle {
    public static void main(String[] args) {
        reactangle rec = new reactangle();
        System.out.println(rec.area(2, 4));
        System.out.println(rec.perimeter(3, 5));
    }
    
}
