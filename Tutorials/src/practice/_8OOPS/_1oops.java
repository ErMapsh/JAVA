package practice._8OOPS;

import java.util.Scanner;

class Employee {
    int _id;
    String name;
    int salary;
    Scanner sc = new Scanner(System.in);

    public int GetSalary() {
        return salary;
    }

    public String GetName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setSalary(int salary) {

        this.salary = salary;
    }

    public void display(){
        System.out.printf("The name of employee is %s and his/her annum salary is %d\n", name, salary);
    }

    /*
     * public void setName(){
     * System.out.print("Enter Your name: ");
     * name = sc.nextLine();
     * }
     * 
     * public void setSalary(){
     * System.out.print("Enter Your salary: ");
     * salary = sc.nextInt();
     * }
     */
}

public class _1oops {
    public static void main(String[] args) {
        Employee mahesh = new Employee();
        mahesh.setName("Mahesh Anant Mestri");
        mahesh.setSalary(250000);

        System.out.printf("The name of employee is %s and his/her annum salary is %d\n",  mahesh.GetName(), mahesh.GetSalary());
        mahesh.display();
    }
}
