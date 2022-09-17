package practice._11AbstractionInterfacePolymorh;

abstract class Telephone {
    abstract void ringing();
    abstract void pickup();
    abstract void Disconnect();

}

class Smartphone extends Telephone {
    @Override
    void ringing() {
        System.out.println("Ringing....");
    }

    @Override
    void pickup() {
        System.out.println("pickuping call....");

    }

    @Override
    void Disconnect() {
        System.out.println("Disconnect....");
    }

    void capture(){
        System.out.println("Capturing");
    }
}

public class _4Telephone {
    public static void main(String[] args) {
        Smartphone vivo = new Smartphone();
        vivo.ringing();
    }
}
