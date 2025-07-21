package Lec_18_TwoPointers;

import java.util.Scanner;

public class Array_returnSq_each {
    static int[] Squares_Array(int[] arr, int n){
        int left=0, right=n-1;
        int ans[]=new int[n];
        int k=0;
        while (left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[k++]=arr[left]*arr[left];
                left++;
            }
            else {
                ans[k++]=arr[right]*arr[right];
                right--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of arr: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of arr that consists only 0's and 1's: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans=Squares_Array(arr,n);
        System.out.println("Sorted array is: ");
        for (int i=n-1;i>=0;i--){
            System.out.print(ans[i]+" ");
        }
    }
}
