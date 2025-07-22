package Lec_19_Arrays6;

import java.util.Scanner;

public class PrefixSum_withoutNewArray {
    static int[] PrefixSum(int[] arr, int n){
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arr: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of arr: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = PrefixSum(arr, n);
        System.out.println("Prefix Sum Array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
