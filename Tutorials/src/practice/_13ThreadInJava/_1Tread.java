package practice._13ThreadInJava;

class GoodMorning extends Thread {
    GoodMorning(String name) {
        super(name);
    }

    public void run() {
        while (true) {
            try {
                System.out.println("Good Morning");
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Welcome extends Thread {
    Welcome(String name) {
        super(name);
    }

    public void run() {
        while (true) {
            try {
                System.out.println("Welcome");
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}

public class _1Tread {
    public static void main(String[] args) {
        /*
            write a program to print "good Morning" and "Welcome" Continuously on the screen in java using thread
         */

        GoodMorning gm = new GoodMorning("gm");
        gm.start();

        Welcome wel = new Welcome("wel");
        wel.start();
    }
}
