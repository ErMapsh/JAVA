package practice._11AbstractionInterfacePolymorh;
interface BasicAnimal {
    void sleep();

    void eat();
}

class Monkey {
    void jump() {
        System.out.println("Jump....");
    }

    void bite() {
        System.out.println("Method....");
    }
}

class Human extends Monkey implements BasicAnimal {
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
        Monkey vandar = new Human();
        vandar.bite();
        vandar.jump();
    }
}
