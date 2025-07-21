package Lec_17_Arrays4;

import java.util.Scanner;

public class Array_Rotate {
    static int[] rotate(int[] arr, int n, int k){
        k=k%n;
        int ans[]=new int[n];
        int j=0;
        for (int i=n-k;i<n;i++){
            ans[j++]=arr[i];
        }
        for (int i=0;i<n-k;i++){
            ans[j++]=arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of arr: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of arr" +
                ": ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter how many times you want to rotate an Array: ");
        int times=sc.nextInt();
        int[] ans=rotate(arr, n, times);
        System.out.println(times+" times Rotated Array is: ");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
