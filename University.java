package LAB4;

public class University {
    static String universityName;
    String studentName;

    University()
    {
        this.universityName = "UPES";
        this.studentName = "Vikrant";
    }

    University(String college,String name)
    {
        this.universityName = college;
        this.studentName = name;
    }

    static void universityName()
    {
        System.out.println(universityName);
    }

    void studentName()
    {
        System.out.println(studentName);
    }
    public static void main(String[] args) {
        University student1 = new University();
        String x = "uit";
        String y = "Lakshita";
        student1.universityName();
        University student2 = new University(x,y);
        String p = "CU";
        String q = "Karan";
        University student3 = new University(p,q);

        student1.universityName();
        student2.universityName();
        student2.studentName();
        student3.studentName();
    }
}

