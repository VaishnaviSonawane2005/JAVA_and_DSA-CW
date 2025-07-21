package Lec_17_Arrays4;

import java.util.Scanner;

public class Array_Rotate_without_ExtraSpace {
    static int[] reverse(int[] arr, int i, int j){
        while(i<j){
            swap(arr, i, j);
            i++;
            j--;
        }
        return arr;
    }
    static int[] swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arr: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of arr" +
                ": ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter how many times you want to rotate an Array: ");
        int k = sc.nextInt();
        k=k%n;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
        System.out.println(k + " times Rotated Array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
