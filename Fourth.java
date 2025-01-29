import java.util.Scanner;
public class Fourth {

    int rectangleArea(int a,int b)
    {
        return a*b;
    }
    int squareArea(int a)
    {
        return a*a;
    }

    double circleArea(int a)
    {
        double c = 3.14;
        return c*a*a;
    }

    float triangleArea(int a,int b)
    {
        float c = 0.5f;
        return c*a*b;
    }
    public static void main(String[] args) {

        Scanner A = new Scanner(System.in);

        int length = A.nextInt();
        int breadth = A.nextInt();
        int side = A.nextInt();
        int radius = A.nextInt();

        Fourth M = new Fourth();
        System.out.println(M.rectangleArea(length,breadth));
        System.out.println(M.squareArea(side));
        System.out.println(M.circleArea(radius));
        System.out.println(M.triangleArea(length,breadth));
    }
}
