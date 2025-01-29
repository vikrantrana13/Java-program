package LAB3;
import java.util.Arrays;

public class RemoveDuplicateElement {

    public static int[] solve(int[] arr,int n)
    {
        int[] temp = new int[n];
        int index = 0;

        for(int i = 0;i<n;i++)
        {
            boolean issame = false;
            for(int j = 0;j<index;j++)
            {
                if(arr[i] == temp[j])
                {
                    issame = true;
                    break;
                }
            }

            if(!issame)
            {
                temp[index++] = arr[i];
            }
        }
        return Arrays.copyOf(temp,index);
    }



    public static void main(String[] args) {
        int[] arr = {2,1,3,5,5,3,2,7,2,8,7,5};

        int n = arr.length;
        int[] res = solve(arr,n);
        Arrays.sort(res);
        System.out.println("new array is :"  + Arrays.toString(res));
    }
}
