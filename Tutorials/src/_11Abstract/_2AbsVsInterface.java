package _11Abstract;

interface Bicycle {
    int NumberOfBreak = 6;
    int MaxBreakLimit = 10;
    int applyBreak(int breakAmount);
    int changeGear(int GearNum);
}

interface HornBicycle{
    void Horn1();
    void Horn2();
}

class Hercules implements Bicycle {
    /* you cannot modifie interface through another class or globaly/localy */
    public int breakLimit;
    public int GearNum;

    Hercules() {
    }

    Hercules(int breakLimit, int GearNum) {
        this.breakLimit = breakLimit;
        this.GearNum = GearNum;
    }

    /*
       is necessary to must implement a interface method where u are implementing a new
       class in
     */
    @Override
    public int applyBreak(int breakAmount) {
        System.out.printf("Break apply is %d - %d is %d\n", breakLimit, breakAmount,  this.breakLimit - breakAmount);
        this.breakLimit = this.breakLimit - breakAmount;
        return this.breakLimit;
    }

    @Override
    public int changeGear(int GearNum) {
        System.out.println("Gear change to " + GearNum);
        return GearNum;
    }
}

class Hero implements Bicycle, HornBicycle{
    @Override
    public int applyBreak(int breakAmount) {
        return this.MaxBreakLimit - breakAmount;
    }

    @Override
    public int changeGear(int GearNum) {
        return GearNum;
    }

    @Override
    public void Horn1() {
        System.out.println("popppopopo");
    }

    @Override
    public void Horn2() {
        System.out.println("tring tring");
    }
}

public class _2AbsVsInterface {
    public static void main(String[] args) {
        System.out.println("----Interface vs Abstract----");

        Hercules herculesCycle = new Hercules(10, 6);
        herculesCycle.applyBreak(2);
        herculesCycle.changeGear(4);

        System.out.println("\n");

        Hero h1 = new Hero();// made up with 2 interfaces
        h1.Horn1();
        System.out.println(h1.applyBreak(3));
        System.out.println(h1.changeGear(4));
        h1.Horn2();
    }
}