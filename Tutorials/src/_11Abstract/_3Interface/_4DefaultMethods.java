package _11Abstract._3Interface;

interface Camera{
    void takeSnap();// taking a snap

    // private method ---> we cant access directly private methods, but we can in interface
    private void Greet(){
        System.out.println("Good Moring");
    }

    // default method is always inherited in implementing class, we can also override this method
    default void Record4kVideo(){
        Greet();
        System.out.println("Recording in 4k video");
    }
}

interface wifi{
    String[] GetNetwork();  //return all networks
    void ConnectedToNetwork(String network); // connecting to network
}

class Cellphone{
    public void callNumber(long number){
        System.out.println("calling the number "+ number);
    }

    public void PickCall(Long incomingCall) {
        System.out.println("pick up incoming call "+ incomingCall);
    }
}


class Smartphone extends Cellphone implements wifi, Camera{
    @Override
    public void takeSnap() {
        System.out.println("Taking a snap");
    }

    @Override
    public String[] GetNetwork() {
        String[] all = {"Mahesh", "ErMapsh", "Hack"};
        return all;
    }

    @Override
    public void ConnectedToNetwork(String network) {
        System.out.println("Connected to the network "+ network);
    }

    @Override
    public void Record4kVideo(){
        System.out.println("Taking a snap and Record 4k Video");
    }
}

public class _4DefaultMethods {
    public static void main(String[] args) {
        System.out.println("---Java Intercace example---");

        // accessing camera things
        Smartphone iphone = new Smartphone();
        iphone.takeSnap();
        System.out.println();

        // accessing wifi things
        System.out.println("All Netorks are: ");
        String[] allNetwork = iphone.GetNetwork();
        for (int i = 0; i < allNetwork.length; i++) {
            System.out.printf("%d.%s\n", i+1, allNetwork[i]);
        }
        iphone.ConnectedToNetwork("ErMapsh");
        System.out.println();

        // accessing cellphone things
        iphone.callNumber(9876543210L);
        iphone.PickCall(9876543210L);


        iphone.Record4kVideo();
    }
}
