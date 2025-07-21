package Lec_18_TwoPointers;

import java.util.Scanner;

public class SortArray0_1_usingPointer_Swap {
    static void SortedArray(int[] arr, int n){
        int left=0, right=n-1;
        while (left<right){
            if(arr[left]==1 && arr[right]==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }
    }
    static int[] swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return arr;
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
        SortedArray(arr,n);
        System.out.println("Sorted array is: ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
