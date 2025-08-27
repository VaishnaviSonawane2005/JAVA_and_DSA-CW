package Recursion;

import java.util.Scanner;

public class Recursion5 {
    static void printArray(int[] arr, int idx) {
        if (idx == arr.length) {
            return;
        }
        System.out.print(arr[idx]+" ");
        printArray(arr, idx + 1);

    }

    static int maxValueArray(int[] arr, int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        int maxV = maxValueArray(arr, idx+1);
        return Math.max(arr[idx], maxV);
    }

//    static int maxValueArray(int[] arr, int idx, int max) {
//        if(idx == arr.length-1){
//            return Math.max(arr[idx], max);
//        }
//        max = Math.max(arr[idx], max);
//        return maxValueArray(arr, idx+1, max);
//    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        printArray(arr, 0);
        System.out.println();
        // System.out.println(maxValueArray(arr, 0, Integer.MIN_VALUE));

        System.out.println(maxValueArray(arr, 0));
    }
}
