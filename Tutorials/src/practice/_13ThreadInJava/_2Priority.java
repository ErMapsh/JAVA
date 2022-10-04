package practice._13ThreadInJava;

class Priority extends Thread {
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("hello");
            i++;
        }
    }
}

class Priority1 extends Thread {

    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("Thanku");
            i++;
        }
    }
}


public class _2Priority {
    public static void main(String[] args) {
        /*
            2. demonstrate getPriority() and setPriority() methods
        */

        Priority pr = new Priority();
        Priority1 pr1 = new Priority1();

        pr1.setPriority(10); // here we set the highest priority to pr1, means he complete first his execution
        pr.setPriority(1);

        System.out.println(pr.getPriority());
        System.out.println(pr1.getPriority());

        pr.start();
        pr1.start();
    }
}
