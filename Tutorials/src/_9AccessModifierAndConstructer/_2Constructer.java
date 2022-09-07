package _9AccessModifierAndConstructer;

class Constructer{
    private int id;
    private String name;

    public void SetData(int id, String name){
        this.id = id;
        this.name = name;
    }

    Constructer(){

    }

    Constructer(String name){
        this.name = name;
        this.id = 12;
    }

    Constructer(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void DisplayInfo(){
        // public method/attributes can accessiable directly and private attribute/methods can accessiable by public method of that class
        System.out.printf("The id of employee is %d and her/his name is %s\n", id, name);
    }
}

public class _2Constructer {    
    public static void main(String[] args) {

        // there are two way to set attributes value
        // 1. through method
        Constructer obj = new Constructer();
        obj.SetData(1, "ermapsh");
        obj.DisplayInfo();

        // 2. through Constructer
        Constructer obj2 = new Constructer(2, "mahesh");
        obj2.DisplayInfo();

        // another example
        Constructer obj3 = new Constructer("Radha");
        obj3.DisplayInfo();
    }    
}
