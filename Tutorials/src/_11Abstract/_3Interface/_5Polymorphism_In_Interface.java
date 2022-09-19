package _11Abstract._3Interface;

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
