package _5Thread_Methods;

class thread1 extends Thread {
    thread1(String name) {
        super(name);
    }

    public void run() {
        while (true) {
            System.out.println("Thank You");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

}

class thread2 extends Thread {
    thread2(String name) {
        super(name);
    }

    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.printf("The id of thread is %d and name is %s.\n", this.getId(), this.getName());
            i++;
        }
    }


}

public class _5Interrupt_Method {
    public static void main(String[] args) {
        System.out.println("-----Interrupt Method---");
        thread1 t1 = new thread1("t1");
        thread2 t2 = new thread2("t2");

        t1.start();
        t2.start();
    }
}
