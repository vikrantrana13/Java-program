public class Second {

    void printPattern()
    {
        int i = 5;
        while(i >= 1)
        {
            int j  = 1;
            while(j<=i)
            {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i--;
            
        }
    }
    public static void main(String[] args) {
        Second A = new Second();
        A.printPattern();
    }
    
}
