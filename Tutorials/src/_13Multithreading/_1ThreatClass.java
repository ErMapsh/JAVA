package _13Multithreading;

/*
 Concurrency is the task of running and managing the 
 multiple computations at the same time. 
 While parallelism is the task of running multiple 
 computations simultaneously. 
*/

class MyThread extends Thread {
    public void run() {
        int i = 0;
        while (i < 4000) {
            i++;
            System.out.println("My thread is running");
            System.out.println("I m Happy!");
        }
    }
}

class MyThread1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 4000) {
            i++;
            System.out.println("My thread1 is bhaging");
            System.out.println("I m sad!");
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        int i = 0;
        while (i < 4000) {
            i++;
            System.out.println("My thread2 is uhh");
            System.out.println("I m angry!");
        }
    }
}

public class _1ThreatClass {
    /*
    thread can be multiple in process (we heard about it multithread in cpu)
    multitherad is helps to do fast process concurrently

    https://www.javatpoint.com/multithreading-in-java
    */

    public static void main(String[] args) {
        MyThread mt = new MyThread();
        MyThread1 mt1 = new MyThread1();
        // it we want to run thread class, then we need to use start();
        mt.start();
        mt1.start();
    }
}
