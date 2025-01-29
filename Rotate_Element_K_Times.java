package LAB3;

import java.util.Arrays;
public class Rotate_Element_K_Times {

    // First method: Brute force O(n^2) time complexity
    public static void solve(int[] arr, int k) {
        int n = arr.length;
        for (int i = 0; i < k; i++) {
            int lastElement = arr[n - 1];
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = lastElement;
        }
        System.out.println(Arrays.toString(arr));
    }

    // Second method using extra space O(n)
    public static void solve1(int[] arr, int k) {
        int n = arr.length;
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = arr[i];
        }

        System.out.println(Arrays.toString(temp));
    }

    // we optmize the space complexity
    public static void solve2(int[] arr, int k) {
        int n = arr.length;

        // Reverse the entire array
        reverse(arr, 0, n - 1);

        // Reverse the first k elements
        reverse(arr, 0, k - 1);

        // Reverse the remaining elements
        reverse(arr, k, n - 1);

        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;

        // Right rotate the array k times

        // solve(arr, k);   
        // solve1(arr, k);    
        solve2(arr, k);      
    }
}
