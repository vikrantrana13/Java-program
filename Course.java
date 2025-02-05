package LAB4;

public class Course {
    String courseName;
    String courseCode;

    Course(String name,String code)
    {
        this.courseName = name;
        this.courseCode = code;
    }

    void display()
    {
        System.out.println(courseName);
        System.out.println(courseCode);
    }

    public static void main(String[] args) {
        Course obj = new Course("Btech","Cse-2");
        obj.display();
    }
}
