package practice._13ThreadInJava;

class State extends Thread {
    State(String name) {
        super(name);
    }

    public void run() {
        System.out.println("The id of thread is " + this.getId());
    }
}

public class _3StateOfThread {
    public static void main(String[] args) {
        State st = new State("st");
        System.out.println(st.getState());
        st.start();
        System.out.println(st.getState());
        System.out.println(Thread.currentThread().getState()); // current thread state
    }
}
