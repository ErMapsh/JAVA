package practice._11AbstractionInterfacePolymorh;
interface BasicAnimal2 {
    void sleep();

    void eat();
}

class Monkey2 {
    void jump() {
        System.out.println("Jump....");
    }

    void bite() {
        System.out.println("Method....");
    }
}

class Human2 extends Monkey2 implements BasicAnimal2 {
    public void eat() {
        System.out.println("Eating....");
    }

    public void sleep() {
        System.out.println("Sleeping....");
    }
}

public class _5polymorph {
    public static void main(String[] args) {
        // polymorphism 
        Monkey2 vandar = new Human2();
        vandar.bite();
        vandar.jump();
    }
}
