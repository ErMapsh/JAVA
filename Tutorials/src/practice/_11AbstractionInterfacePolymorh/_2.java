package practice._11AbstractionInterfacePolymorh;

abstract class pen1{
    abstract void write();
    abstract void refill();
}


class FountainPen1 extends pen1{
    @Override
    void write() {
        System.out.println("Writing....");
    }

    @Override
    void refill() {
        System.out.println("Pen refilling...");
    }

    void changeRefill(){
        System.out.println("Changing Refill");
    }
}

public class _2 {
    public static void main(String[] args) {
        FountainPen1 fp1 = new FountainPen1();
        fp1.changeRefill();
    }
}
