package LAB3;

public class Palindrome {

    public static boolean solve(String str)
    {
        int i = 0,j = str.length() - 1;

        while(i < j)
        {
            if(str.charAt(i) == str.charAt(j))
            {
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        String str = "level";

        boolean res = solve(str);
        System.out.println("The give string is palindrome : " + res);
    }
}
