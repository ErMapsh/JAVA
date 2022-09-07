package practice._9AccessModifierAndConstructer;
class sphere{
    private int radius;

    sphere(int radius){
        this.radius = radius;
    }

    void DisplaySurfaceArea(){
        System.out.println("Area of sphere is "+ (4* 3.14* (radius * radius)));
    }

    void SurfaceArea(){
        System.out.println("Surface area of sphere is "+ ((4/3)* 3.14* (radius* radius* radius)));
    }
}
public class _3Sphere {
    public static void main(String[] args) {
        sphere sp = new sphere(4);
        sp.DisplaySurfaceArea();
        sp.SurfaceArea();
    }
}
