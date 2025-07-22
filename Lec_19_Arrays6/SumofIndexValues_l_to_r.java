package Lec_19_Arrays6;

import java.util.Scanner;

public class SumofIndexValues_l_to_r {
    static int[] MakePrefixSumArray(int[] arr){
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arr: ");
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        System.out.println("Enter the elements of arr: ");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] prefixSum = MakePrefixSumArray(arr);
        System.out.println("Enter the no. of queries to search: ");
        int q=sc.nextInt();
        while(q-->0){
            System.out.println("Enter range (l and r): ");
            int l=sc.nextInt();
            int r=sc.nextInt();

            int ans=prefixSum[r] - prefixSum[l-1];
            System.out.println("Sum is: "+ans);
        }
    }
}
