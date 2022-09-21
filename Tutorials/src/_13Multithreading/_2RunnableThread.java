package _13Multithreading;

class MyThreadRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("I m thread 00000");
        System.out.println("I m thread 00000");
        System.out.println("I m thread 00000");
        System.out.println("I m thread 00000");
        System.out.println("I m thread 00000");
        System.out.println("I m thread 00000");
        System.out.println("I m thread 00000");
        System.out.println("I m thread 00000");
        System.out.println("I m thread 00000");
        System.out.println("I m thread 00000");
        System.out.println("I m thread 00000");
        System.out.println("I m thread 00000");
        System.out.println("I m thread 00000");
        System.out.println("I m thread 00000");
        System.out.println("I m thread 00000");
        System.out.println("I m thread 00000");
        System.out.println("I m thread 00000");
        System.out.println("I m thread 00000");
        System.out.println("I m thread 00000");
        System.out.println("I m thread 00000");
        System.out.println("I m thread 00000");
        System.out.println("I m thread 00000");
        System.out.println("I m thread 00000");
        System.out.println("I m thread 00000");
    }
}

class MyThreadRunnable1 implements Runnable {
    @Override
    public void run() {
        System.out.println("I m thread 11111");
        System.out.println("I m thread 11111");
        System.out.println("I m thread 11111");
        System.out.println("I m thread 11111");
        System.out.println("I m thread 11111");
        System.out.println("I m thread 11111");
        System.out.println("I m thread 11111");
        System.out.println("I m thread 11111");
        System.out.println("I m thread 11111");
        System.out.println("I m thread 11111");
        System.out.println("I m thread 11111");
        System.out.println("I m thread 11111");
        System.out.println("I m thread 11111");
        System.out.println("I m thread 11111");
        System.out.println("I m thread 11111");
        System.out.println("I m thread 11111");
        System.out.println("I m thread 11111");
        System.out.println("I m thread 11111");
        System.out.println("I m thread 11111");
        System.out.println("I m thread 11111");
        System.out.println("I m thread 11111");
        System.out.println("I m thread 11111");
        System.out.println("I m thread 11111");
        System.out.println("I m thread 11111");
        System.out.println("I m thread 11111");
        System.out.println("I m thread 11111");
        System.out.println("I m thread 11111");
        System.out.println("I m thread 11111");
        System.out.println("I m thread 11111");
    }
}

class MyThreadRunnable2 implements Runnable {
    @Override
    public void run() {
        System.out.println("I m thread2");
    }
}

public class _2RunnableThread {
    public static void main(String[] args) {
        /*
            while creating runnable thread we need to implement a class using Runnable interface 
        */

        MyThreadRunnable bullet1 = new MyThreadRunnable();
        Thread gun1 = new Thread(bullet1);

        MyThreadRunnable1 bullet2 = new MyThreadRunnable1();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

    }
}
