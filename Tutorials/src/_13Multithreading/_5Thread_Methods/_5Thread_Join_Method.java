package _13Multithreading._5Thread_Methods;

class MyThre1 extends Thread {
    MyThre1(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            System.out.printf("Id of thread is %d and name is %s.\n", this.getId(), this.getName());
        }
    }
}

class MyThre2 extends Thread {
    MyThre2(String name) {
        super(name);
    }

    public void run() {
        while (true) {
            System.out.printf("Id of thread is %d and name is %s.\n", this.getId(), this.getName());
        }
    }
}

class _5Thread_Join_Method {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("-----Thread Methods-----");
        MyThre1 t1 = new MyThre1("t1");
        MyThre2 t2 = new MyThre2("t2");

        /*
         Here is simple thing I want to do, the both thread are running on same time,
         but I want after complete execution of t1, t2 should run
         then I can do this like this
         1. we can use join method on t1
        */

        t1.start();
        try {
            t1.join(); // Waits for this thread to die, but t1 never going to die due to his infinity loop
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();
    }
}