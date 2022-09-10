package practice._10Inheri;

class circle {
    /* area of circle = πr2 */
    public float pie = 3.14f;
    public float radius;

    circle(float radius) {
        this.radius = radius;
    }

    public float AreaOfCircle() {
        return (pie * (radius * radius));
    }

}

class Cylinder extends circle {
    /* A=2πrh+2πr2 */
    private float height;

    Cylinder(float radius, float height) {
        super(radius);
        this.height = height;
    }

    public float AreaOfCylinder() {

        return ((2 * pie * radius * height) + (2 * AreaOfCircle()));
    }
}

public class _1circular {
    public static void main(String[] args) {
        System.out.println("----Circle to cylinder---");

        Cylinder cyl = new Cylinder(12, 15);
        System.out.println( cyl.AreaOfCylinder());
    }
}
