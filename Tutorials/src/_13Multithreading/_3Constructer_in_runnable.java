class MyTh implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello there");
    }

}

public class _3Constructer_in_runnable {
    public static void main(String[] args) {
        MyTh mt = new MyTh();
        Thread newTh = new Thread(mt, "new_runnable_thered");

        System.out.println("The id of thread is " + newTh.getId());
        System.out.println("THe name of thread is " + newTh.getName());

        newTh.start();
    }
}
