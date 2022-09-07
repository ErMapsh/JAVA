package _8OOPS;

class Employe{
    int _id;
    String name;
    int salary = 200000;

    public void display(){
        System.out.println("My Id is "+ _id);
        System.out.println("My name is "+ name);
    }

    public int PrintSalary(){
        System.out.printf("%s salary is %d", name, salary);
        return salary;
    }


};

public class _2CreatingOwnClass {
    public static void main(String[] args) {

        Employe emp = new Employe();// Creating instance

        emp._id = 73;// setting attributes of emp object
        emp.name = "ErMapsh";// setting attributes of emp objects

        // printing the attributes
        System.out.println(emp._id);
        System.out.println(emp.name);

        // printing the attributes via methods
        emp.display();
        emp.PrintSalary();

    }
}
