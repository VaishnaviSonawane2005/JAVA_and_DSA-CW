package Lec_19_Arrays6;

import java.util.Scanner;

public class SplitArray_havingsameSum {
    static int findArraySum(int[] arr){
        int totalSum=0;
        for (int i=0;i<arr.length;i++){
            totalSum+=arr[i];
        }
        return totalSum;
    }

    static boolean equalSumPartition(int[] arr){
        int totalSum=findArraySum(arr);
        int prefSum=0;
        for (int i = 0; i < arr.length; i++) {
            prefSum+=arr[i];
            int suffsum=totalSum-prefSum;
            if(suffsum==prefSum){
                return true;
            }
        }
        return false;
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
        System.out.println("Equal Partition Possible: "+equalSumPartition(arr));
    }
}
