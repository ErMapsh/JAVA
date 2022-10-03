package _11Abstract;

// abstract method we can say kayali pulav, is there is not mention about in his body

abstract class parent {
    /*
        abstract class is begin when there is any abstract method in a class
        
        abstract method dont having anything in his body.

    */

    parent() {
        System.out.println("---I m parent Constructor----");
    }

    public void Greeting() {
        System.out.println("Good Morning");
    }

    abstract void absMethod();
}

class child1 extends parent {
    /* there are two ways to use abstract parent class 
        1. override abstract method (basically we saying i dont want abstract method from parent class)
    */

    @Override
        // because we dont want parent abstract method
    void absMethod() {
        System.out.println("i dont want my parents abstract methods so, i created my own, without begin abstract class");
    }
}

abstract class child2 extends parent {
    /* there are two ways to use abstract parent class 
        2. basically we use created class as abstract class ( so abstract class can own his or parent abstract methods)
    */

    void me() {
        System.out.println("we use created class as abstract class ( so abstract class can own his or parent abstract methods)");
    }
}

public class _1Abstract {
    public static void main(String[] args) {
        System.out.println("---Abstract---");

        child1 ch = new child1();
        ch.absMethod();

        // parent p1 = new parent(); // we cant call abstract class directly

        // child2 ch2 = new child2();

    }
}


/*
    concreate class (normal class) mean that dont have any abstract method, 

    if u want concreate class then need to override abstract method, in derived class
    otherwise make a class as derived class
*/