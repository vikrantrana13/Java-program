import java.util.Scanner;

public class First {

    char Grade(int a,int b,int c)
    {
        int average = (a + b + c)/3;

        if(average >= 90)
        {
            return 'A';
        }
        else if(average >= 75)
        {
            return 'B';
        }
        else if(average >= 50)
        {
            return 'C';
        }
        else {
            return 'F';
        }
    }
    public static void main(String[] args)
    {
        Scanner A = new Scanner(System.in);

        System.out.println("enter the number for first subject" );
        int a = A.nextInt();
        System.out.println("enter the number for second subject");
        int b = A.nextInt();
        System.out.println("enter the number for third subject" );
        int c = A.nextInt();

        First M = new First();

        char res = M.Grade(a,b,c);
        System.out.println(res);


    }
    
}
