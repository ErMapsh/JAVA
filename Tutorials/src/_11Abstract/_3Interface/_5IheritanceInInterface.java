package _11Abstract._3Interface;

interface sample1{
    void meth1();
    void meth2();
}

// we can inheritance interface in interface but we can't inheritance interface in clas
interface sample2 extends sample1{
    void meth3();
    void meth4();
}

class Class1 implements sample2{
    public void meth1(){
        System.out.println("method: 1");
    }
    public void meth2(){
        System.out.println("method: 2");
    }
    public void meth3(){
        System.out.println("method: 3");
    }
    public void meth4(){
        System.out.println("method: 4");
    }
}

public class _5IheritanceInInterface {
    public static void main(String[] args) {
        System.out.println("----Inheritance in interface----");
        Class1 c1 = new Class1();
        c1.meth1();
        c1.meth2();
        c1.meth3();
        c1.meth4();
    }
}
