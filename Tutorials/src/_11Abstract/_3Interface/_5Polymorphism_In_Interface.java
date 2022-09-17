package _11Abstract._3Interface;

interface Camera {
    void takeSnap();// taking a snap

    // private method ---> we cant access directly private methods, but we can in
    // interface
    private void Greet() {
        System.out.println("Good Moring");
    }

    // default method is always inherited in implementing class, we can also
    // override this method
    default void Record4kVideo() {
        Greet();
        System.out.println("Recording in 4k video");
    }
}

interface wifi {
    String[] GetNetwork(); // return all networks

    void ConnectedToNetwork(String network); // connecting to network
}

class Cellphone {
    public void callNumber(long number) {
        System.out.println("calling the number " + number);
    }

    public void PickCall(Long incomingCall) {
        System.out.println("pick up incoming call " + incomingCall);
    }
}

class Smartphone extends Cellphone implements wifi, Camera {
    @Override
    public void takeSnap() {
        System.out.println("Taking a snap");
    }

    @Override
    public String[] GetNetwork() {
        String[] all = { "Mahesh", "ErMapsh", "Hack" };
        return all;
    }

    @Override
    public void ConnectedToNetwork(String network) {
        System.out.println("Connected to the network " + network);
    }

    @Override
    public void Record4kVideo() {
        System.out.println("Taking a snap and Record 4k Video");
    }
}

public class _5Polymorphism_In_Interface {
    public static void main(String[] args) {

        /* 
        polymorphism means one thing may can do many things
        for example 
        wifi =  smartphone
        */

        // using smartphone we can enable wifi, using smarphone object we can easily access wifi this is example of polymorphism
        wifi wifi1 = new Smartphone();

        // getting a all networks as to a smarphone
        String[] op = wifi1.GetNetwork();
        for (int i = 0; i < op.length; i++) {
            System.out.printf("%d.%s\n",i+1, op[i]);
        }

        // connecting to network as to a smarphone
        wifi1.ConnectedToNetwork("ErMapsh");
    }
}
