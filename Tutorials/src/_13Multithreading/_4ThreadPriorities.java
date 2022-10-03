class MyThre extends Thread {
    public MyThre(String name) {
        super(name);
    }

    public void run() {
        int i = 0;
        while (i < 10) {
            i++;
            System.out.println("The id of Thread is: " + this.getId() + " & Thread Name is: " + this.getName());
        }
    }
}

public class _4ThreadPriorities {
    public static void main(String[] args) {
        // ready queue : t1 t2 t3 t4 t5

        /*
         * java.lang.Thread.MIN_PRIORITY = 1
         * java.lang.Thread.NORM_PRIORITY = 5
         * java.lang.Thread.MAX_PRIORITY = 10
         */

        MyThre t1 = new MyThre("t1");
        MyThre t2 = new MyThre("t2");
        MyThre t3 = new MyThre("t3 (second most imp)");
        MyThre t4 = new MyThre("t4");
        MyThre t5 = new MyThre("t5 (most imp)");

        t5.setPriority(Thread.MAX_PRIORITY);// its gives more priority to t5
        t3.setPriority(Thread.NORM_PRIORITY);// its gives normal priority to t3
        t1.setPriority(Thread.MIN_PRIORITY);// its gives min priority to t5
        t2.setPriority(Thread.MIN_PRIORITY);// its gives min priority to t5
        t4.setPriority(Thread.MIN_PRIORITY);// its gives min priority to t5
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
