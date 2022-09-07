package practice._9AccessModifierAndConstructer;

class  react{
    private int lenght;
    private int breath;

    react(){
        this.lenght = 4;
        this.breath = 5;
    }

    react(int lenght, int breath){
        this.lenght = lenght;
        this.breath = breath;
    }

    void DisplayArea(){
        System.out.printf("area is %d\n", lenght*breath);
    }
}
public class _2Reactangular {
    public static void main(String[] args) {
        react obj = new react();
        obj.DisplayArea();

        react obj1 = new react(4, 2);
        obj1.DisplayArea();
    }
}
