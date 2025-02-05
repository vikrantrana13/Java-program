package LAB4;

public class Employee {
    int Id;
    String Name;
    String Department;
    private String Salary;
    static int totalEmployee;

    Employee()
    {
        this.Id = 102;
        this.Name = "vikrant";
        this.Department = "Cse";
        this.Salary = "20 lAKH";
        totalEmployee++;
    }

    Employee(int id,String name,String depart,String sal)
    {
        this.Id = id;
        this.Name = name;
        this.Department = depart;
        this.Salary = sal;
        totalEmployee++;
    }

    static void displayCount()
    {
        System.out.println(totalEmployee);
    }

    public String getSalary()
    {
        return Salary;
    }

    void displayEmployeeInfo()
    {
        System.out.println(Id);
        System.out.println(Name);
        System.out.println(Department);
        System.out.println(getSalary());
        System.out.println();
    }

    public static void main(String[] args) {
        Employee E1 = new Employee();
        Employee E2 = new Employee(103,"Lakshita","cse","19 lakh");
        Employee E3 = new Employee(104,"Piyush","cse","18 lakh");

        E1.displayEmployeeInfo();
        E2.displayEmployeeInfo();
        E3.displayEmployeeInfo();

        Employee.displayCount();
    }
}
