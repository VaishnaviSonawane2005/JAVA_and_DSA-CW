package Lec_17_Arrays4;

import java.util.Scanner;

public class ReverseArray_usingSwap {
    static int[] arr_reverse(int arr[], int n){
        int i=0, j=n-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
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
        arr_reverse(arr, n);
        System.out.println("Reversed Array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
