package LAB4;

import java.util.Scanner;
public class Student {

    public  String name;
    public  int age;

    public Student()
    {
        this.name = "vikrant";
        this.age = 20;
    }
    public Student(String x,int y)
    {
        this.name = x;
        this.age = y;
    }
    public void display()
    {
        System.out.println("name is : " + name);
        System.out.println("age is :" + age);
    }

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        System.out.println("enter your name :");
        String x = a.nextLine();
        System.out.println("enter your age :");
        int y = a.nextInt();

        Student s = new Student();
        Student s1 = new Student(x,y);

        System.out.println("Details of the first student");
        s.display();
        System.out.println("Details of the second student");
        s1.display();
    }
}
