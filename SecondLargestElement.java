package LAB3;

public class SecondLargestElement {

    public static int code(int[] arr,int n,int k)
    {
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for(int i = 0;i<n;i++)
        {
            if(arr[i] > largest)
            {
                secondlargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondlargest && arr[i] != largest)
            {
                secondlargest = arr[i];
            }
        }
        return secondlargest;
    }

    public static void main(String[] args) {
        int[] arr = {12,32,22,54,39,53,19};
        int n = arr.length;
        int k = 2;

        int res = code(arr,n,k);
        System.out.println("largest value of this array" + res);
    }
}






