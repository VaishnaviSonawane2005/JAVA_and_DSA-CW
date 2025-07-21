package Lec_18_TwoPointers;

import java.util.Scanner;

public class SortArray0s_and_1s {
    static int[] CountZeros(int[] arr, int n){
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count++;
            }
        }
        for (int i=0;i<n;i++){
            if(i<count){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arr: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of arr that consists only 0's and 1's: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        CountZeros(arr, n);
        System.out.println("Sorted array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
