package _21Java8Features._4Sort_a_List._3Example;

public class Employee {
    private  int Id;
    private String Name;
    private String Dept;
    private long Salary;

    public Employee() {}

    Employee(int Id, String Name, String Dept, long Salary){
        this.Id = Id;
        this.Name = Name;
        this.Dept = Dept;
        this.Salary = Salary;
    }


    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSalary(long salary) {
        Salary = salary;
    }

    public void setDept(String dept) {
        Dept = dept;
    }

    public int getId() {
        return Id;
    }


    public String getName() {
        return Name;
    }

    public long getSalary() {
        return Salary;
    }


    public String getDept() {
        return Dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Dept='" + Dept + '\'' +
                ", Salary=" + Salary +
                '}';
    }

}
