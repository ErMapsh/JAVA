class MyThr extends Thread {
    public MyThr(String name) {
        super(name);
    }

    public void run() {
        int i = 0;
        while (i < 100) {
            i++;
            System.out.println("Hello");
        }
    }
}

public class _3Constructer_in_ThreadClass {
    public static void main(String[] args) {

        /*
         * Constructer in Thread:
         * 
         * * this is we done extending Thread class
         * Thread()
         * Thread(String name)
         * 
         * this is have to implementing runnable interface 
         * Thread(Runnable r)
         * Thread(Runnable r, String name)
         * 
         * methods
         * setName()
         * getName()
         * getId()
         */
        MyThr mt = new MyThr("first");
        MyThr mt1 = new MyThr("third");

        // operation on mt
        System.out.println("mt ka name: " + mt.getName());
        System.out.println("mt ki ID: " + mt.getId());

        mt.setName("second");
        System.out.println("mt ka new name: " + mt.getName());
        System.out.println("mt ki ID: " + mt.getId());

        // operation on mt1
        System.out.println("mt1 ka name: " + mt1.getName());
        System.out.println("mt1 ki ID: " + mt1.getId());

        // mt.start();

    }
}
