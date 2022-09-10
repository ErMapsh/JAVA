package practice._10Inheri;

class reactangular {
    public int height;

    reactangular() {
        System.out.println("Default constructer");
    }

    reactangular(int height) {
        this.height = height;
    }

    int AreaOfReact() {
        return height * height;
    }
}

class Cuboid extends reactangular {
    // area = 2lw+2lh+2hw

    private int length;
    private int width;

    Cuboid() {
    }

    Cuboid(int height, int length, int width) {
        super(height);
        this.length = length;
        this.width = width;
    }

    int AreaOfCuboid() {
        return  2 * ((length * width) + (length * height) + ( height * width));
    }

}

public class _2ReactAndCuboid {
    public static void main(String[] args) {
        Cuboid cub = new Cuboid(12, 5, 3);
        System.out.println("Reactangular area: " + cub.AreaOfReact());
        System.out.println("Cuboid surface area: " + cub.AreaOfCuboid());
    }
}
