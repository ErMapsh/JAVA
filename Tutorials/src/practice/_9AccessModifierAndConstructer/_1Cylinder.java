package practice._9AccessModifierAndConstructer;

class Cylinder{
    private int radius;
    private int height;

    Cylinder(int radius, int height){
        this.radius = radius;
        this.height = height;
    }

    public void CylinderVol(){
        System.out.println("The volume of cylinder is "+ (3.14 * (radius*radius) * height));
    } 

    void SetHeight(int x){
        height = x;
    }

    void SetRadius(int x){
        radius = x;
    }

    void DisplaySurfaceArea(){
        System.out.printf("Surface Area is %.2f ", ((2* 3.14 *radius* height)+(2 * 3.14 * (radius* radius))));
    }
}


public class _1Cylinder {
    public static void main(String[] args) {
        System.out.println("----Cylinder Porblem----");

        Cylinder cyl = new Cylinder(9, 12);
        cyl.CylinderVol();
        cyl.DisplaySurfaceArea();

    }
}
