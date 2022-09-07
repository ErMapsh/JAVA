package _9AccessModifierAndConstructer;


/* access modifier and  function/constructer overloading */

class myEmployee{

    /*  but we can access public attributes/method driectly 
        we can't directly access private, protected attributes/methods, but we can access through class methods 
    */
    
    public String gender; 
    private int id ; 
    private String name;
    protected int salary;


    //default constructer                               
    myEmployee(){}

    // parameterized constructer
    myEmployee(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // this type of methods called constructer overloading
    myEmployee(int id, String name, int salary, String gender){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }
    
    public void display(){
        System.out.printf("The id of employe is %d and his/her name is %s and his/her salary is %s\n", id, name, salary);
    }
}

public class _1Program {
    public static void main(String[] args) {
        System.out.println("----Access Modifier----");
        /*
            is specify where the poperty/method is accessible  

            there are 4 types of access modifier :
            1. public
            2. private
            3. protected
            4. default
        */

        myEmployee ermapsh = new myEmployee(1, "Mahesh", 15000);
        // ermapsh.id =1 ; this is not accessiable directly due private access modifier
        ermapsh.display();

        // default constructer
        myEmployee mahesh = new myEmployee();
        mahesh.display();

        myEmployee mapsh = new myEmployee(73, "ErMapsh", 2000000, "Male");
        mapsh.display();


    }
}
