package practice._11AbstractionInterfacePolymorh;

abstract class pen{
    abstract void write();
    abstract void refill();
}


class FountainPen extends pen{
    @Override
    void write() {
        System.out.println("Writing....");
    }

    @Override
    void refill() {
        System.out.println("Pen refilling...");
    }
}

public class _1abstractClass {
    public static void main(String[] args) {
        System.out.println("\n---1.abstract class---\n");
        FountainPen reymond = new FountainPen();
        reymond.write();
        reymond.refill();
        
    }   
}
