import java.util.Scanner;

public class Third {
   
   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("enter the number you want");
      int var2 = var1.nextInt();
      switch (var2) {
         case 1:
            System.out.println("the day is monday");
            break;
         case 2:
            System.out.println("tuesday");
            break;
         case 3:
            System.out.println("wednesday");
            break;
         case 4:
            System.out.println("thursday");
            break;
         case 5:
            System.out.println("friday");
            break;
         case 6:
            System.out.println("saturday");
            break;
         case 7:
            System.out.println("sunday");
            break;
         default:
            System.out.println("invalid day");
      }

   }
}
